package class3HW;
import java.util.*;
public class len_br {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double len = sc.nextDouble();
        System.out.print("Enter Breadth: ");
        double br = sc.nextDouble();
        sc.close();

        double ar = len*br;
        double per = 2*(len+br);

        if(ar>per)
            System.out.print("Area " + ar + " is Greater than Perimeter " + per);
        else if(ar == per)
            System.out.print("Area " + ar + " is Equal than Perimeter " + per);
        else
            System.out.print("Area " + ar + " is Less than Perimeter " + per);
    }
}