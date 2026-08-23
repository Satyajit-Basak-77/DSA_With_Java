/*
*****
 ****
  ***
   **
    *
*/

package class5_Pattern;

public class downsideRevTri {
    public static void main(String[] args) {
        for(int i=5; i>=1; i--){
            for(int j=1; j<(5-i+1); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
