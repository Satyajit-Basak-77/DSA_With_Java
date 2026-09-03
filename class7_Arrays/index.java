/*Multiply odd indexed elements by 2 and add 10 to even indexed elements*/
package class7_Arrays;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 34, 21, 32};
        printarr(arr);
        for(int i=0; i<arr.length; i++){
            if(i%2==0) arr[i]+=10;
            else arr[i]*=2;
        }
        printarr(arr);

    }
    public static void printarr(int[] a) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
