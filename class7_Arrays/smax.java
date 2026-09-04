package class7_Arrays;

public class smax {
    public static void main(String[] args) {
        int[] a = {4,10,10,6,3,8};
        int max = a[0];
        int smax = Integer.MIN_VALUE;
        //double loop
        // for(int i=0; i<a.length; i++){
        //     if(a[i]>max){
        //         max = a[i];
        //     }
        // }

        // for(int i=0; i<a.length; i++){
        //     if(a[i]>smax && a[i] != max) smax = a[i];
        // }
        // System.out.println("Max is: " + max);
        // System.out.println("Second Max is: " + smax);

        //single loop
        for(int i=0; i<a.length; i++){
            if (a[i] > max) max = a[i];
            else if (a[i]>smax && a[i] != max) smax = a[i];
        }
        System.out.println("Max is: " + max);
        System.out.println("Second Max is: " + smax);
    }
}