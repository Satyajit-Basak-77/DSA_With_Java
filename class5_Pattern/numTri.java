/*
1 
2 2 
3 3 3 
4 4 4 4 
*/
package class5_Pattern;

public class numTri {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
/*
A 
A B 
A B C 
A B C D 
*/
        for(int i=4; i>=1; i--){
            for(int j=65; j<=69-i; j++){
                System.out.print((char)j + " ");
            }
            System.out.println();
        }
    }
}