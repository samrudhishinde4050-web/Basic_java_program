
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListeg5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Numbers: " + numbers);

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        if (numbers.contains(search)) {
            System.out.println(search + " is present in the list.");
        } else {
            System.out.println(search + " is not present in the list.");
        }

        sc.close();
    }
}
