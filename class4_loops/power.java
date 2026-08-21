package class4_loops;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long pow = sc.nextLong();
        long res=1;
        sc.close();

        for(int i=1; i<=pow; i++){
            res*=n;
        }

        System.out.println(res);
    }
}
