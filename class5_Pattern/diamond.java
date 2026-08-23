/*
   *
  ***
 *****
*******
 *****
  ***
   *
*/
package class5_Pattern;

public class diamond {
    public static void main(String[] args) {
        for(int i=4; i>=1; i--){
            //spaces
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            //stats
            for(int j=1; j<=(4-i+1); j++){
                System.out.print("*");
            }

            for(int j=1; j<(4-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=2; i<=4; i++){
            //spaces
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            //stats
            for(int j=1; j<=(4-i+1); j++){
                System.out.print("*");
            }

            for(int j=1; j<(4-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}