package class4_loops;
import java.util.*;
public class APseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        for(int i=2; i<=2+(n-1)*3; i+=3){
            System.out.print(i + " ");
        }
    }
}
