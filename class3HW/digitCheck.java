//check a number is 4 digit or not
package class3HW;

import java.util.Scanner;

public class digitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n>999 && n<10000){
            System.out.print("4 digit ");
        } else {
            System.out.print("NON 4 digit ");
        }

        sc.close();
    }
}