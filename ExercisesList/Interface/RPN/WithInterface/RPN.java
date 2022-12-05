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
    
    public static double evaluate(String expr) 
    {
        if (expr.isEmpty()) 
            return 0;

        int start = 0;
        Stack<Double> stack = new Stack<>(); // Crio minha pilha de doubles

        do
        {
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
                Double a = stack.pop();
                Double b = stack.pop();
                stack.push(operate(current.charAt(0),b,a));
            }
            // Se atual eh um operando adiciono na pilha
            else
            {
                if (current.charAt(end) == 'i')
                    current.replace(current.charAt(end), (char)Math.sqrt(-1));
                stack.push(Double.parseDouble(current));
            }

            // Recomeço a partir do proximo numero ou operador
            start = end + 1;
        }while(start < expr.length()); // Faço isso ate a expressao terminar

        // Retiro o unico numero que sobrou na pilha e armazeno na variavel resultado
        double result = stack.pop();

        // Se a pilha nao estiver vazia retorno o maior valor
        while(!stack.isEmpty())
        {
            double current = stack.pop();
            if (current > result)
                result = current;
        }

        // Retorno o resultado
        return result;
    }
}