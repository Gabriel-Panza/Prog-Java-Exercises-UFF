package Interface.RPN.WithoutInterface;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Calculadora NPR:");
        System.out.println("Digite '.exit' a qualquer momento para sair");
        String inp = "";
        Scanner teclado = new Scanner(System.in);

        while(inp != ".exit")
        {
            System.out.println("Digite uma expressao NPR:");
            System.out.print("-> ");
            inp = teclado.nextLine();
            try{
                System.out.println(CalculadoraRPN.evaluate(inp));
            } catch(Exception e){
                System.out.println("Invalid Expression, Try again or type '.exit' to quit");
            }
        }

        teclado.close();
    }
}