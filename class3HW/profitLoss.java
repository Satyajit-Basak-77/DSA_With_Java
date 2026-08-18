/*
Take input of Cost price and selling price of a product and determine if seller got profit and loss and no profit no loss
and how much will be it. 
*/
package class3HW;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Cost: ");
        double cprice = sc.nextDouble();
        System.out.print("Enter Sell Price: ");
        double sprice = sc.nextDouble();

        if(sprice - cprice == 0){
            System.out.println("No profit No Loss");
        } else if ((sprice - cprice)<0){
            System.out.print("Loss is " + -(sprice - cprice) + "Rs. and " + ((sprice - cprice)*100)/cprice + "% loss");
        } else {
            System.out.print("Profit is " + (sprice - cprice) + " Rs. and " + ((sprice - cprice)*100)/cprice + "% profit");
        }
        sc.close();
    }
}
