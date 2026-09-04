/*Print product of elements of the array. */
package class7_ArraysHW;
public class produch {
    public static void main(String[] args) {
        int[] arr = {3,7,3,8};
        int pro = 1;
        for(int i=0; i<arr.length; i++){
            pro *= arr[i];
        }
        System.out.println("Product is = "+pro);
    }
}
