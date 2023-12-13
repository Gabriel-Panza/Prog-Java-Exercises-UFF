import java.util.*;

public class RemoveEvenNumbers {
    public static void removeEvenNumbers(ArrayList<Integer> numbers) {
        for (int i=0;i<numbers.size();i++) {
            if (numbers.get(i) % 2 == 0) numbers.remove(i);
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int number;
        do {
            System.out.print("Type 0 to stop or other number to continue adding: ");
            number = teclado.nextInt();
            if (number!=0) numbers.add(number);
        } while(number!=0);

        System.out.println("Original ArrayList: " + numbers);

        // Remove even numbers
        removeEvenNumbers(numbers);

        System.out.println("ArrayList after removing even numbers: " + numbers);
        teclado.close();
    }
}
