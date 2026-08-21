package class3_if_else;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();
        
        // if-else
        // if(a%2 == 0) System.out.print("Even");
        // else System.out.print("Odd");

        //ternary
        System.out.print((a%2 == 0) ? "Even" : "Odd");

        // this is can be also directly written in the sout function that's why front of "Even" "odd" sout function is not needed.
    }
}