package class7_Arrays;

public class sum {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 34, 21, 32};
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
