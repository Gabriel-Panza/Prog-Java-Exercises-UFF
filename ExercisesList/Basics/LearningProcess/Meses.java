package Basics.LearningProcess;
import java.util.Scanner;

class Meses 
{
    public static void main()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com um mês (1 a 12): ");
        byte mes = teclado.nextByte();
        switch (mes) 
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Esse mês tem 31 dias!");
                break;

            case 4: case 6: case 9: case 11:
                System.out.println("Esse mês tem 30 dias!");
                break;

            case 2:
                System.out.print("Entre com o ano (4 dígitos): ");
                short ano = teclado.nextShort();
                if ((ano%400==0)||((ano%4==0)&&(ano%100!=0)))
                    System.out.println("Esse mês tem 29 dias!");
                else
                    System.out.println("Esse mês tem 28 dias!");
                break;
            default:
                System.out.println("Mês inválido!");
        }
        teclado.close();
    }
}
