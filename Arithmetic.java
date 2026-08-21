// Program to perform arithmetic operations

import java.util.*;

class Arithmetic {
    public static void main(String args[]) {

        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of a and b:");

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));
    }
}