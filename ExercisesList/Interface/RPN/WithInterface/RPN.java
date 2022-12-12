package Interface.RPN.WithInterface;

import java.util.*;

public class RPN 
{
    // Defino as operaçoes
    public static double operate(char operand,double a, double b)
    {
        Hashtable<Character,Double> opHash = new Hashtable<Character,Double>();
        opHash.put('+',a + b);
        opHash.put('-',a - b);
        opHash.put('*',a * b);
        opHash.put('/',a / b);

        // returno o resultado de a <operando> b
        return opHash.get(operand);
    }
    
    public static String evaluate(String expr) throws Exception
    {
        if (expr.isEmpty()) 
            return "0";

        // Defino o inicio da string
        int start = 0;

        // Crio minha pilha de doubles
        Stack<Double> pilha = new Stack<>();
        // Crio minha pilha de strings para os numeros imaginarios
        Stack<String> pilhaString = new Stack<>();
        // Crio minha variavel que vai armazenar o numero imaginario caso haja algum
        String resultString = "";

        do
        {
            // Defino uma variavel booleana para avaliar se tem numero imaginario no meio ou nao
            Boolean imaginario = false;

            // Defino onde esta o espaco
            int space = expr.substring(start).indexOf(' ');
            
            // Defino ate onde a minha substring vai (determino o final do numero).
            int end;
            if (space == -1)
                end = expr.length();
            else
                end = start + space;

            // Defino ate onde o numero ou operador atual vai (paro ao encontarr um espaço)
            String current = expr.substring(start,end);

            // Se atual eh um operador realiza as operaçoes necessarias
            if("+-*/".indexOf(current.charAt(0)) != -1)
            {
                //Removo dois da pilha e aplico a operaçao
                if (pilha.capacity()>=2)
                {
                    Double a = pilha.pop();
                    Double b = pilha.pop();
                    pilha.push(operate(current.charAt(0),b,a));
                }
            }
            // Se atual eh um operando adiciono na pilha
            else
            {
                for (int i=0; i<current.length();i++)
                {
                    if (current.charAt(i)== 'i')
                    {
                        imaginario = true;
                        break;
                    }
                }
                // Se a substring era composta apenas do i, o length da substring vai virar 0, e logo nao preciso adicionar nada na pilha
                if (imaginario)
                    pilhaString.push(current);
                else
                    pilha.push(Double.parseDouble(current));
            }

            // Recomeço a partir do proximo numero ou operador
            start = end + 1;
        }while(start < expr.length()); // Faço isso ate a expressao terminar

        // Retiro o unico numero que sobrou na pilha e armazeno na variavel result
        double result = pilha.pop();
        
        if (!pilhaString.empty())
            resultString = pilhaString.pop();

        // Se a pilha nao estiver vazia, ou seja, tive mais operações do que operadores(sinais), retorno o maior valor
        while(!pilha.isEmpty())
        {
            double current = pilha.pop();
            if (current > result)
                result = current;
        }

        // Retorno o resultado
        if (pilhaString.isEmpty())
            return String.valueOf(result);
        else
            return String.valueOf(result) + resultString;
    }
}