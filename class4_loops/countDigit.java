package class4_loops;
import java.util.*;
public class countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int x=n;
        int count=0, rem, sum=0; 
        //digit count
        for(int i=n; i>0; i=i/10){
            count = count + 1;
        }
        n=x;
        for(int i=1; i<=count; i++,n=n/10){
            rem = n%10;
            sum = sum+rem;
        }

        System.out.println(sum);
    }
}
