package class3HW;
import java.util.*;
public class leastIn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        if(a==b && a==c) System.out.println("All equal.");
        else if(b==c && a<b) System.out.println("2nd and 3rd are equal and " + a + " is least");
        else if(b==c && a>b) System.out.println("2nd and 3rd are equal and " + a + " is Greatest");
        else if(a<b && a<c) System.out.println(a + " is least.");
        else if (b<c) System.out.println(b + " is least.");
        else System.out.println(c + " is least");
    }   
}
