package Basics.LearningProcess;
import java.util.Scanner;

public class IMC 
{
    public static double info(Scanner keyword, String message) 
    {
        System.out.print(message);
        return keyword.nextDouble();
    }
    public static void main(String[] args) 
    {
        Scanner keyword = new Scanner(System.in);

        double height = info(keyword, "Type a cm height");
        double mass = info(keyword, "Type a kg mass");
        double imc = mass / Math.pow(height, 2);
        System.out.println("Your IMC is " + imc);

        keyword.close();
    }    
}
