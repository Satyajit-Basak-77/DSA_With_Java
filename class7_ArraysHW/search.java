package class7_ArraysHW;
import java.util.*;
public class search {
    public static void main(String[] args) {
        int f=0;
        int p=0;
        Scanner sc = new Scanner(System.in);
        int arr[] = {4, 5, 6, 34, 21, 32};
        
        System.out.println("Enter the element you watn to get: ");
        int sea = sc.nextInt();
        sc.close();
        for (int i=0; i<arr.length; i++){
            if(sea == arr[i]){ 
                f=1;
                p=i;
            }
        }
        printarr(arr);
        if(f==1) System.out.print("Found at position " + (p+1));
        else System.out.println("Not found");
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