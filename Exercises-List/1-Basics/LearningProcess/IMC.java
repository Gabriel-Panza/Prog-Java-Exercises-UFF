package Basics.LearningProcess;
import java.util.Scanner;

public class IMC 
{
    public static double info(Scanner teclado, String mensagem) 
    {
        System.out.print(mensagem);
        return teclado.nextDouble();
    }
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        double altura = info(teclado, "Informe a sua altura em cm");
        double massa = info(teclado, "Informe a sua massa em kg");
        double imc = massa / Math.pow(altura, 2);
        System.out.println("Seu IMC é " + imc);

        teclado.close();
    }    
}
