//ALTERNATE VERSION OF absoluteValue with only using if and not else 
package class3HW;

import java.util.Scanner;

public class absoluteValue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        if(n<0){
            n = -n;
        }

        System.out.println(n);
        sc.close();
    }
}
