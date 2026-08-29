package class6_methods;

import java.util.Scanner;

public class maxAndmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.print("Max btw two number is = ");
        System.out.print(Math.max(a, b));
    }
}
