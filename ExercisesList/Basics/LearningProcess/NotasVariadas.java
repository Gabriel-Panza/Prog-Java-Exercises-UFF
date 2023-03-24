package Basics.LearningProcess;
import java.util.Scanner;

public class NotasVariadas
{
    public static void main(String[] args) 
    {
        Scanner keyword = new Scanner(System.in);
        int students_numbers = keyword.nextInt();
        
        String[] names = new String[students_numbers];
        float[] grades = new float[students_numbers];
        float average = 0;
        
        for (int i = 0; i < students_numbers; i++) 
        {
            System.out.print("Type the name of the student "+(i+1)+": ");
            names[i] = keyword.nextLine();
        }
        for (int i = 0; i < students_numbers; i++) 
        {
            System.out.print("Type the grade of " + names[i] + ": ");
            grades[i] = keyword.nextFloat();
            average += grades[i];
        }
        average /= students_numbers;
        
        for (int i = 0; i < students_numbers; i++) 
        {
            if (grades[i] > average)
            System.out.println("Congratulations " + names[i]);
        }
        keyword.close();
    }
}
