package Basics.LearningProcess;
import java.util.Scanner;

class VerificaTriangulo 
{
    public static void main(String[] args) 
    {
        Scanner keyword = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3, det; 
        int L1, L2, L3, L4, L5, L6;

        System.out.println("Type the 3 ordered pair of coordinates: ");
        x1 = keyword.nextInt();
        y1 = keyword.nextInt();
        x2 = keyword.nextInt();
        y2 = keyword.nextInt();
        x3 = keyword.nextInt();
        y3 = keyword.nextInt();

        L1 = x1*y2;
        L2 = x2*y3;
        L3 = x3*y1;
        L4 = y1*x2;
        L5 = y2*x3;
        L6 = y3*x1;

        det = (L1 + L2 + L3) - (L4 + L5 + L6);
        if (det==0)
        {
            System.out.println("These coordinates arent a triangle");
        }
        else
        {
            if ((L1 == L2 && L2 == L3) || (L4 == L5 && L5 == L6))
                System.out.println("These coordinates form an equilateral triangle");
            else if ((L1 == L2 && L2 == L3) || (L4 != L5 && L5 != L6))
                System.out.println("These coordinates form an isosceles triangle");
            else
                System.out.println("These coordinates form a scalene triangle");
        }
        keyword.close();
    }    
}
