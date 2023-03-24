package Basics.LearningProcess;
import java.util.Scanner;

public class Fatorial 
{
    public static void main(String[] args) 
    {
        Scanner keyword = new Scanner(System.in);    
        System.out.println("Type a positive number: ");
        int number = keyword.nextInt();
        long fat = 1;
        while (number>0)
            fat *= number--;
        /*
        for (int i = 2; i<=number; i++)
            fat *= i;
        */
        /*
        for (int i = number; i>1; i--)
            fat *= i;
        */
        System.out.println("The fatorial number is: " + fat);
        keyword.close();
    }    
}
