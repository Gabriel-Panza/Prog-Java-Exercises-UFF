package Basics.LearningProcess;
import java.util.Scanner;

public class Troca 
{
    public static void change(int x, int y) 
    {
        int aux = x;
        x = y;
        y = aux;
    }
    public static float average(int x, int y) 
    {
        return (x + y) / 2f;
    }
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        change(a, b);

        System.out.println("a: " + a + ", b: " + b);
        System.out.println("Average: " + average(a,b));
        keyboard.close();   
    }
}
