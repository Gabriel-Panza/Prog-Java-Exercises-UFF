package Basics.LearningProcess;
import java.util.Scanner;

public class Divisores 
{
    public static void main(String[] args) 
    {
        Scanner keyword = new Scanner(System.in);
        System.out.println("Type a positive number: ");
        int n = keyword.nextInt();
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
                    System.out.println("This number is prime");
                    break;            
                }
                else if ((n==2 || n==3 || n==5 || n==7))
                {
                    System.out.println("This number is not prime");
                    break;        
                }
            }
            System.out.println("Type a positive number: ");
            n = keyword.nextInt();
        } while (n>=0);
        keyword.close();
    }    
}
