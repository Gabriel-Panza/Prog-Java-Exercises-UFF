package Basics.LearningProcess;
public class Array 
{
    public static void change(int[] array) 
    {
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
    public static void print(int[] array) 
    {
        System.out.println(array[0] + ", " + array[1]);
    }
    public static void main(String[] args) 
    {
        int[] array = { 10, 20 };
        print(array);
        change(array);
        print(array);
    }
}