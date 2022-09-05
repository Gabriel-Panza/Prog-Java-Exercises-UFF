import java.util.Scanner;

public class Citacao 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        String iniciais = "";
        String sobrenome = "";
        
        System.out.print("Entre com um nome completo: ");
        String nome = teclado.nextLine().trim();
        
        int inicio = 0;
        int fim = nome.indexOf(" ", inicio);
        while (fim != -1) 
        {
            iniciais += nome.substring(inicio, inicio + 1) + ". ";
            inicio = fim + 1;
            fim = nome.indexOf(" ", inicio);
        }
        sobrenome = nome.substring(inicio).toUpperCase();
        
        System.out.print(sobrenome + ", ");
        System.out.println(iniciais.toUpperCase().trim());
        teclado.close();
    }    
}