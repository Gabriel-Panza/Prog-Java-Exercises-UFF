package HeritageAndPolimorph.LearningProcess;

import java.util.Scanner;

public class Error 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe dois valores: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        String mensagem = null;

        try {
            mensagem = getError(a, b);
        } 
        catch (ArithmeticException e) {
            mensagem = "Nao foi possivel calcular divisao por 0 ou infinito";
        }
        finally{
            System.out.println(mensagem);
        }
        teclado.close();
    }

    public static String getError(int a, int b) throws ArithmeticException
    {
        int c = a/b;
        return "O resultado eh: " + c;
    }
}
