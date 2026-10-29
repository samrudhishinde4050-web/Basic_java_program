
import java.util.Scanner;

public class CheckingAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.println("Available Balance: " + balance);

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Please enter a valid amount.");
        } else if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }

        sc.close();
    }
}
