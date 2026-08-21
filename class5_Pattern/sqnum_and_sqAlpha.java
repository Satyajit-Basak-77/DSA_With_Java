package class5_Pattern;

public class sqnum_and_sqAlpha {
    public static void main(String[] args) {
        /*
        A B C D 
        A B C D 
        A B C D 
        A B C D 
        */
        for(int i=1; i<=4; i++){
            for(int j=65; j<=68; j++)
                System.out.print((char)j + " ");
            System.out.println();
        }
        System.out.println();

        /*
        1 2 3 4 
        1 2 3 4 
        1 2 3 4 
        1 2 3 4 
        */
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
