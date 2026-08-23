/*
    *****
   *****
  *****
 *****
*****
*/
package class5_Pattern;

public class rombhus {
    public static void main(String[] args) {
        for(int i=5; i>=1; i--){
            //spaces
            for(int j=i; j>1; j--){
                System.out.print(" ");
            }
            //stars
            for(int j=5; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
