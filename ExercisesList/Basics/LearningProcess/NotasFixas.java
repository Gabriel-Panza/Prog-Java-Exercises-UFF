package Basics.LearningProcess;
import java.util.Scanner;

public class NotasFixas 
{
    public static void main(String[] args) 
    {
        Scanner keyword = new Scanner(System.in);
        String name1, name2, name3;
        float grade1, grade2, grade3, media;

        System.out.print("Type the name of the student 1: ");
        name1 = keyword.nextLine();
        System.out.print("Type the name of the student 2: ");
        name2 = keyword.nextLine();
        System.out.print("Type the name of the student 3: ");
        name3 = keyword.nextLine();
        System.out.print("Type the grade of " + name1 + ": ");
        grade1 = keyword.nextFloat();
        System.out.print("Type the grade of " + name2 + ": ");
        grade2 = keyword.nextFloat();
        System.out.print("Type the grade of " + name3 + ": ");
        grade3 = keyword.nextFloat();
        media = (grade1 + grade2 + grade3)/3;

        if (grade1 > media)
            System.out.println("Congratulations " + name1);
        if (grade2 > media)
            System.out.println("Congratulations " + name2);
        if (grade3 > media)
            System.out.println("Congratulations " + name3);
        keyword.close();
    }
}