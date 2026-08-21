package class4_loops;
import java.util.*;
public class GPseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        sc.close();

        
        for(int i=1; i<=n; i++){
            System.out.print(a + " ");
            a*=2;
        }
    }
}
