/*This function will work perfectly*/
package class6_methodsHW;

import java.util.Scanner;
public class swap {
    public static void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.print("After swapping " + " x = " + a + " and y = " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        System.out.print("Before swapping " + " x = " + x + " and y = " + y + "\n");
        Swap(x, y);
    }
}
