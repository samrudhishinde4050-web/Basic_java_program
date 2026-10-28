
import java.util.ArrayList;

public class ArrayListeg4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        numbers.remove(Integer.valueOf(30));

        System.out.println("After Removing 30: " + numbers);

        numbers.remove(0);

        System.out.println("After Removing First Element: " + numbers);
    }
}
