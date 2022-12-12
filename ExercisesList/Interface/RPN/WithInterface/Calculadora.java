package Interface.RPN.WithInterface;

import java.util.*;

public class Calculadora 
{
    public static String calc(String expString) throws Exception
    {
        if (expString.isEmpty()) 
            return "0";

        // Crio as variaveis responsaveis por cuidar das operaçoes
        RPN calcRpnReais = new RPNReais();
        RPN calcRpnComplx = new RPNComplexos();

        // Defino o inicio da string
        int start = 0;

        // Crio minha pilha de doubles
        Stack<String> pilha = new Stack<>();

        do
        {
            // Defino onde esta o espaco
            int space = expString.substring(start).indexOf(' ');
            
            // Defino ate onde a minha substring vai (determino o final do numero).
            int end;
            if (space == -1)
                end = expString.length();
            else
                end = start + space;

            // Defino ate onde o numero ou operador atual vai (paro ao encontarr um espaço)
            String current = expString.substring(start,end);

            // Realizo as operações necessárias
            try{
                // Se atual eh um operador realiza as operaçoes
                if("+-*/".indexOf(current.charAt(0)) != -1)
                {
                    //Removo dois da pilha e aplico a operaçao
                    if (pilha.capacity()>=2)
                    {
                        String a = pilha.pop();
                        String b = pilha.pop();
                        try {
                            // Tenta fazer entre 2 doubles
                            pilha.push(calcRpnReais.operate(current.charAt(0),b,a));
                        } catch (Exception exception) {
                            // Se nao funcionar, faz por numero complexo
                            pilha.push(calcRpnComplx.operate(current.charAt(0),b,a));
                        }
                    }
                }
                // Se atual eh um operando adiciono na pilha
                else
                {
                    pilha.push(current);
                }
            } catch(Exception exception){
                throw exception;
            }

            // Recomeço a partir do proximo numero ou operador
            start = end + 1;
        }while(start < expString.length()); // Faço isso ate a expressao terminar

        // Retiro o unico numero que sobrou na pilha e armazeno na variavel result
        String result = pilha.pop();

        return result;
    }
}
