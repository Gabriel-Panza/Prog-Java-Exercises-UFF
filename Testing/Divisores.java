import java.util.Scanner;

public class Divisores 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro positivo: ");
        int n = teclado.nextInt();
        do
        {
            for (int i=1;i<=n;i++)
            {
                if (n%i==0)
                {
                    System.out.println(i + " ");
                }
                else if ((n%2!=0) && (n%3!=0) && (n%5!=0) && (n%7!=0))
                {
                    System.out.println("Este número eh primo");
                    break;            
                }
                else if ((n==2 || n==3 || n==5 || n==7))
                {
                    System.out.println("Este número eh primo");
                    break;        
                }
            }
            System.out.println("Digite um numero inteiro positivo: ");
            n = teclado.nextInt();
        } while (n>=0);
        teclado.close();
    }    
}
