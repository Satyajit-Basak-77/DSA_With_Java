package class7_ArraysHW;
import java.util.*;
public class proAdd {
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
        System.out.print("Array is: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        inputarr(num);
        printarr(num);
        for(int i=0; i<num.length; i++){
            if(i%2!=0) num[i]*=2;
            else num[i]+=10;
        }
        System.out.print("Now the edited one is: ");
        printarr(num);
        sc.close();
    }
}
