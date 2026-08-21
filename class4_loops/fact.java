package class4_loops;
import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        long fact=1;

        for(long i=1; i<=n; i++){
            fact*=i;
        }

        System.out.println(fact);
    }
}
