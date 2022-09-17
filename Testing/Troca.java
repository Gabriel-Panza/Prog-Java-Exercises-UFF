import java.util.Scanner;

public class Troca 
{
    public static void troca(int x, int y) 
    {
        int aux = x;
        x = y;
        y = aux;
    }
    public static float media(int x, int y) 
    {
        return (x + y) / 2f;
    }
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        troca(a, b);

        System.out.println("a: " + a + ", b: " + b);
        System.out.println("média: " + media(a,b));
        teclado.close();   
    }
}
