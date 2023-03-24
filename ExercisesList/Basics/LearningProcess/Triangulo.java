package Basics.LearningProcess;
import java.util.Scanner;

class Triangulo 
{
    public static void main(String[] args) 
    {
        // Este codigo calcula a área de um triangulo
        Scanner keyword = new Scanner(System.in);
        int height, base;
        float area;

        System.out.print("Type a height: ");
        height = keyword.nextInt();
        System.out.print("Type the base: ");
        base = keyword.nextInt();
        area = 0.5f * height * base;
        System.out.println("Area: " + area);
        keyword.close();
    }
}
