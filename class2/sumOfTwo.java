package class2;
import java.util.Scanner;
public class sumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st num: ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int y = sc.nextInt();
        System.out.print("Enter 3rd num: ");
        int z = sc.nextInt();

        int Sum = x+y+z;
        System.out.print("Summation is: ");
        System.out.print(Sum);
        sc.close();
    }
}
