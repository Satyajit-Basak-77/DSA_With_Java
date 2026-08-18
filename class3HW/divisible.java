package class3HW;
import java.util.*;
public class divisible {
    public static void main(String[] args) {
        System.out.print("Enter +ve integer: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if(a%5 == 0)
            System.out.println("YES");
        else 
            System.out.println("NO");

        sc.close();
    }
}