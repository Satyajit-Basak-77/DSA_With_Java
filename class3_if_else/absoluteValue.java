package class3_if_else;
import java.util.*;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        if(n>=0) System.out.print(n);
        else System.out.print(-n);

        sc.close();
    }
}