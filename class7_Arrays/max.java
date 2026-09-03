package class7_Arrays;

import java.util.Scanner;

public class max {
    public static void printarr(int[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array is: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        sc.close();
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 34, 21, 32};
        int max = arr[0];
        printarr(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("The max element is: " + max);
    }
}