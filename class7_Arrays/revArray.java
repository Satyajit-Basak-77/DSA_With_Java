package class7_Arrays;

public class revArray {
    public static void main(String[] args) {
        int[] arr = {6,8,1,2,4,9,3};

        for(int i=0; i<(arr.length/2); i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-1-i] = temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        // int[] brr = new int[arr.length];

        // for(int i=arr.length-1; i>=0; i--){
        //     brr[(arr.length-1)-i] = arr[i];
        // }
        // for( int x : brr){
        //     System.out.print(x+" ");
        // }
    }
}
