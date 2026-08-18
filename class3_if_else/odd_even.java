package class3_if_else;
import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println("Even");
            System.out.println("sss");
        }
        else{
            System.out.println("Odd");
            System.out.println("klasdh");
        }
        
        sc.close();
    }
}