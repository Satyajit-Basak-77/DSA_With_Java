//Check if a number is divisible by 5 or 3 or both. 
package class3HW;

import java.util.Scanner;

public class multiDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        //condition checking. 
        if(a%5==0 && a%3==0) System.out.print("Divisible by both. ");
        else if (a%5 == 0) System.out.print("Divisible by 5");
        else if (a%3 == 0) System.out.print("Divisible by 3");
        else System.out.print("Divisible by None. ");
    }
}
