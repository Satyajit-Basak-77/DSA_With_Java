//Check if the 3 inteer inputs are can be sides of a triangle or not.
package class3HW;
import java.util.*;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if(a+b>c && b+c>a && c+a>b){
            System.out.print("Triangle. ");
        } else {
            System.out.print("Not Triangle. ");
        }
    }
}