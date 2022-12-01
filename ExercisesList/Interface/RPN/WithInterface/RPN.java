package Interface.RPN.WithInterface;

import java.util.*;

public class RPN 
{
    public static double evaluate(String expr) 
    {
        if (expr.isEmpty()) 
            return 0;

        int start = 0;
        Stack<Double> stack = new Stack<>(); // Crio minha pilha de doubles

        do
        {
            int space = expr.substring(start).indexOf(' ');       // Defino o que eh um espaço
            int end = (space == -1 ? expr.length() : start + space); // Defino o final da minha expressao com base no tamanho no espaco de cima

            String current = expr.substring(start,end);        // numero ou operador atual
            if("+-*/".indexOf(current.charAt(0)) != -1) // Se atual eh um operador realiza as operaçoes necessarias
            {
                //Removo dois da pilha e aplico a operaçao
                Double a = stack.pop();
                Double b = stack.pop();
                stack.push(operate(current.charAt(0),b,a));
            }
            else // Se atual eh um operando adiciono na pilha
            {
                if (current == "i")
                    current = Double.toString(Math.sqrt(-1));
                stack.push(Double.parseDouble(current));
            }
            start = end + 1;            // Recomeço a partir de um novo inicio
        }while(start < expr.length()); // Faço isso ate a expressao terminar

        double result = stack.pop(); // Retiro o unico numero que sobrou na pilha e armazeno na avriavel resultado

        while(!stack.isEmpty())    // Se a pilha nao estiver vazia retorno o maior valor
        {
            double current = stack.pop();
            result = current > result ? current : result;
        }

        return result;
    }

    // Defino as operaçoes
    public static double operate(char operand,double a, double b)
    {
        Hashtable<Character,Double> opHash = new Hashtable<Character,Double>();
        opHash.put('+',a + b);
        opHash.put('-',a - b);
        opHash.put('*',a * b);
        opHash.put('/',a / b);

        // returno a <operando> b
        return opHash.get(operand);
    }
}