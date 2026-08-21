package class4_loops;
import java.util.*;
public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        int count=0,x,rev=0,rem;
        for(x=n;n>0;n=n/10){
            count++;
        }
        n=x;
        for(int i=1; i<=count; i++,n=n/10){
            rem = n%10;
            rev = rev*10+rem;
        }

        System.out.println(rev);
    }
}
