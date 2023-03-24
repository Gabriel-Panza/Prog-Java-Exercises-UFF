package Basics.LearningProcess;
import java.util.Scanner;

class Meses 
{
    public static void main()
    {
        Scanner keyword = new Scanner(System.in);
        System.out.print("Type a month (1 to 12): ");
        byte month = keyword.nextByte();
        switch (month) 
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("This month has 31 days!");
                break;

            case 4: case 6: case 9: case 11:
                System.out.println("This month has 30 days!");
                break;

            case 2:
                System.out.print("Type a year with 4 digits: ");
                short year = keyword.nextShort();
                if ((year%400==0)||((year%4==0)&&(year%100!=0)))
                    System.out.println("This month has 29 days!");
                else
                    System.out.println("This month has 28 days!");
                break;
            default:
                System.out.println("Invalid month!");
        }
        keyword.close();
    }
}
