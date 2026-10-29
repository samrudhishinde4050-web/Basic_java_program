
import java.util.Scanner;

public class Composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println(number + " is neither prime nor composite.");
        } else {
            boolean isComposite = false;

            for (int i = 2; i <= number / i; i++) {
                if (number % i == 0) {
                    isComposite = true;
                    break;
                }
            }

            if (isComposite) {
                System.out.println(number + " is a composite number.");
            } else {
                System.out.println(number + " is not a composite number.");
            }
        }

        sc.close();
    }
}
