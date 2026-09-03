package class7_Arrays;
import java.util.*;
public class byFuncprint {
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
        sc.close();
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        inputarr(arr);
        printarr(arr);
    }
}
