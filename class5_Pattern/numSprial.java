/*
1 1 1 1 1 1 1 
1 2 2 2 2 2 1 
1 2 3 3 3 2 1 
1 2 3 4 3 2 1 
1 2 3 3 3 2 1 
1 2 2 2 2 2 1 
1 1 1 1 1 1 1
*/
package class5_Pattern;

public class numSprial {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=2*n-1; j++){
                int a=i, b=j;
                if(i>n) a = 2*n -i;
                if(j>n) b = 2*n -j;
                System.out.print(((a<b) ? a : b) + " "); // or Math.min(i,j)
            }
            System.out.println();
        }
    }
}