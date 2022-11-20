package Basics.LearningProcess;
import java.util.Scanner;

public class Fatorial 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);    
        System.out.println("Digite um número inteiro positivo: ");
        int numero = teclado.nextInt();
        long fat = 1;
        while (numero>0)
            fat *= numero--;
        /*
        for (int i = 2; i<=numero; i++)
            fat *= i;
        */
        /*
        for (int i = numero; i>1; i--)
            fat *= i;
        */
        System.out.println("O fatorial desse número eh: " + fat);
        teclado.close();
    }    
}
