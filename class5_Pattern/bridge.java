package class5_Pattern;

public class bridge {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++)
            System.out.print("*");
        System.out.println();
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            for(int j=1; j<(5-i)+1; j++){
                System.out.print(" ");
            }

            for(int j=2; j<(5-i)+1; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
