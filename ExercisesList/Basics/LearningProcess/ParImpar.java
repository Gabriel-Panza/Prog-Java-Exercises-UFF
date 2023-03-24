package Basics.LearningProcess;
import java.util.Scanner;

class ParImpar 
{
    public static void main(String[] args) 
    {
        Scanner keyword = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = keyword.nextInt();
        
        if (number % 2 == 0)
            System.out.println("This number is even!");
        else
            System.out.println("This number is odd!");
        keyword.close();
    }
}