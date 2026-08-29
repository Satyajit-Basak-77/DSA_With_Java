package class6_methods;
import java.util.*;
public class pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        double p = Math.pow(a, b);

        System.out.println(p);
    }
}