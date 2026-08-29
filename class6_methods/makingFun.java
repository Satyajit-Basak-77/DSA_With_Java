package class6_methods;
import java.util.*;
public class makingFun {
    // public static void Greatestamong3 (int a, int b, int c){
    //     if(a>b && a>c) System.out.println(a);
    //     else if(b>c) System.out.println(b);
    //     else System.out.println(c);
    // }

    public static int Greatestamong3(int a, int b, int c) {
        int x = Math.max(Math.max(a, b), c);
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int gx = Greatestamong3(a, b, c);
        System.out.println(gx);
    }
}