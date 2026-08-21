package class5_Pattern;

public class rightAlphaTri {
    public static void main(String[] args) {
        int a = 65;
        for(int i=1; i<=4; i++){
            //spaces
            for(int j=0; j<4-i; j++)
                System.out.print(" ");

            //stars
            for(int j=1; j<=i; j++){
                System.out.print((char)a);
            }
            a++;

            System.out.println();
        }
    }
}
