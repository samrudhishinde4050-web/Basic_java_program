
import java.util.ArrayList;

public class ArrayListeg2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Fruits: " + fruits);

        System.out.println("First Fruit: " + fruits.get(0));

        fruits.set(1, "Grapes");

        System.out.println("After Updating: " + fruits);

        System.out.println("Contains Mango: " + fruits.contains("Mango"));
    }
}
