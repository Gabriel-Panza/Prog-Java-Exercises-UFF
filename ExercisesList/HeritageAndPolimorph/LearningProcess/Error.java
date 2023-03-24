package HeritageAndPolimorph.LearningProcess;

import java.util.Scanner;

public class Error 
{
    public static void main(String[] args) 
    {
        Scanner keyword = new Scanner(System.in);
        
        System.out.println("Type two values: ");
        int a = keyword.nextInt();
        int b = keyword.nextInt();
        String message = null;

        try {
            message = getError(a, b);
        } 
        catch (ArithmeticException e) {
            message = "Error! Division with zero or infinity detected!";
        }
        finally{
            System.out.println(message);
        }
        keyword.close();
    }

    public static String getError(int a, int b) throws ArithmeticException
    {
        int c = a/b;
        return "The result is: " + c;
    }
}
