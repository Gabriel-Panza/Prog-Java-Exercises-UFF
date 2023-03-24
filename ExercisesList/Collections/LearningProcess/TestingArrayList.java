package Collections.LearningProcess;

import java.util.*;

public class TestingArrayList 
{
    public static void main(String[] args) 
    {
        int cont=0;
        String class1 = "Knowing more about lists";
        String class2 = "Learning more about Class Aula";
        String class3 = "Working with Courses e Sets";

        ArrayList<String> classes = new ArrayList<>();
        classes.add(class1);
        classes.add(class2);
        classes.add(class3);

        System.out.println(classes);
        
        for (String c : classes) 
        {
            System.out.println("Class " + ++cont + ": " + c);
        }
        System.out.println("\n");
        for (int i=0; i<classes.size(); i++)
        {
            System.out.println("Class " + (i+1) + ": " + classes.get(i));
        }
        System.out.println("\nReading:");
        classes.forEach(aula -> {
            System.out.println(aula);
        });

        String classRemoved = classes.get(1);
        classes.remove(class2);

        System.out.println("\n" + classes);
        System.out.println("A aula removida foi: " + classRemoved);

        classes.add("Increasing our knowledge");
        Collections.sort(classes);
        System.out.println("\n" + classes);
    }    
}
