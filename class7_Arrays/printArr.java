package class7_Arrays;
import java.util.*;
public class printArr {
    public static void main(String[] args) {
    int[] brr = new int[6];
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<brr.length; i++){
        System.out.print("Enter new num: ");
        brr[i] = sc.nextInt();
    }
    //output
    for(int i=0; i<brr.length; i++){
        System.out.print(brr[i] + " ");
    }
    sc.close();
}
}