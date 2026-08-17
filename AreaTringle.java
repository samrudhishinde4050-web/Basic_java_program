// Java program to calculate area of triangle

import java.util.*;

class AreaTringle {
    public static void main(String args[]) {

        float b, h, area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base and height of triangle:");

        b = sc.nextFloat();
        h = sc.nextFloat();

        area = (b * h) / 2;

        System.out.println("Area of triangle is = " + area);
        sc.close();
        
    }
}