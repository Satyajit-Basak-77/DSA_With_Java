package class3HW;
import java.util.*;
public class int_ot_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        double n = sc.nextDouble();

        int nI = (int)n;

        if(n-nI == 0) System.out.print("Integer"); // or (n-(int)n) == 0
        else System.out.print("Non Integer");

        sc.close();
    }
}