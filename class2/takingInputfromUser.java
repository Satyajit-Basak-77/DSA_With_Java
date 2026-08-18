package class2;

import java.util.Scanner;

public class takingInputfromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();
        double a = 3.1415 * r * r;
        System.out.print("Area is: ");
        System.out.println(a);
        sc.close();
    }
    
}