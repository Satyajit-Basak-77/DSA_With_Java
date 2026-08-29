package class6_methods;

import java.util.Scanner;

public class maxAndminBtw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.print(Math.max(Math.max(a, b), c));
    }
}