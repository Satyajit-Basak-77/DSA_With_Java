//ALTERNATE VERSION OF profitLoss with only using if multiple times and not else 
package class3HW;

import java.util.Scanner;

public class profitLoss2 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);

        double cp = sc.nextDouble();
        double sp = sc.nextDouble();

    if (sp > cp) System.out.print("Profit");
    if (sp < cp) System.out.print("Loss");
    if(sp == cp) System.out.print("No profit No Loss");

    sc.close();
    }
}