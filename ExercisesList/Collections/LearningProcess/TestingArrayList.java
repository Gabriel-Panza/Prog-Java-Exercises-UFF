package Collections.LearningProcess;

import java.util.*;

public class TestingArrayList 
{
    public static void main(String[] args) 
    {
        int cont=0;
        String aula1 = "Knowing more about lists";
        String aula2 = "Learning more about Class Aula";
        String aula3 = "Working with Courses e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);
        
        for (String aula : aulas) 
        {
            System.out.println("Aula " + ++cont + ": " + aula);
        }
        System.out.println("\n");
        for (int i=0; i<aulas.size(); i++)
        {
            System.out.println("Aula " + (i+1) + ": " + aulas.get(i));
        }
        System.out.println("\nPercorrendo:");
        aulas.forEach(aula -> {
            System.out.println(aula);
        });

        String aulaRemovida = aulas.get(1);
        aulas.remove(aula2);

        System.out.println("\n" + aulas);
        System.out.println("A aula removida foi: " + aulaRemovida);

        aulas.add("Increasing our knowledge");
        Collections.sort(aulas);
        System.out.println("\n" + aulas);
    }    
}
