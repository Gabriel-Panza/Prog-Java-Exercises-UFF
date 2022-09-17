import java.util.Scanner;

public class IMC 
{
    public static double info(int x) 
    {
        Scanner teclado = new Scanner(System.in);
        if (x==0)
            System.out.print("Entre com a sua altura em metros: ");
        if (x==1)
            System.out.print("Entre com a sua massa em kg: ");
        
        teclado.close();
        return teclado.nextDouble();
    }
    public static void main(String[] args) 
    {
        double altura = info(0);
        double massa = info(1);
        double imc = massa / Math.pow(altura, 2);

        System.out.println("Seu IMC é " + imc);
    }    
}
