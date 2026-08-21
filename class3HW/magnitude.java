package class3HW;
import java.util.*;
public class magnitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        sc.close();

        if(n<0) n = -n;

        if(n<69) System.out.println("Less");
        else if (n==69) System.out.println("Equal");
        else System.out.println("Greater");
    }
}