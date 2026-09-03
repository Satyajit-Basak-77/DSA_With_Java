package class7_Arrays;

import java.util.Scanner;

public class nveprint {
    public static void inputarr(int[] a) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            System.out.print("Enter a num: ");
            a[i] = sc.nextInt();
        }
        sc.close();
    }
    public static void main(String[] args) {
        int[] num = new int[5];
        inputarr(num);
        System.out.println("List of -ve numbers are = ");
        for(int i=0; i<num.length; i++){
            if(num[i]<0) System.out.print(num[i]+ " ");
        }
    }
}