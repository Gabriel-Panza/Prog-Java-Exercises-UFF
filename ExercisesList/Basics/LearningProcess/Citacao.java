package Basics.LearningProcess;
import java.util.Scanner;

public class Citacao 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        String starters = "";
        String surname = "";
        
        System.out.print("Type a full name: ");
        String nome = keyboard.nextLine().trim();
        
        int start = 0;
        int end = nome.indexOf(" ", start);
        while (end != -1) 
        {
            starters += nome.substring(start, start + 1) + ". ";
            start = end + 1;
            end = nome.indexOf(" ", start);
        }
        surname = nome.substring(start).toUpperCase();
        
        System.out.print(surname + ", ");
        System.out.println(starters.toUpperCase().trim());
        keyboard.close();
    }    
}