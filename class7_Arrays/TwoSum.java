package class7_Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void inputarr(int[] a) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            System.out.print("Enter a num: ");
            a[i] = sc.nextInt();
        }
        sc.close();
    }
    public static void printarr(int[] a) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        sc.close();
    }
    public static void main(String[] args) {
        int[] num = new int[10];
        inputarr(num);
        printarr(num);
        int target = 5;
        System.out.println("Two sum: ");
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i] + num[j] == target){
                    System.out.println( num[i] + " & " + num[j]);
                }
            }
        }
    }
}