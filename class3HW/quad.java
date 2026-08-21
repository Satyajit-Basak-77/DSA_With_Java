package class3HW;
import java.util.*;
public class quad {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter x and y coordinate: ");
        double coodX = sc.nextDouble();
        double coodY = sc.nextDouble();
        sc.close();

        if(coodX == 0 && coodY==0)
            System.out.println("They are in the Origin (0,0)");
        else if(coodX == 0 && (coodY > 0 || coodY <0))
            System.out.println("Point is in the Y Axis");
        else if((coodX > 0 || coodX < 0) && coodY == 0)
            System.out.println("Point is in the X Axis");
        else if(coodX>0 && coodY>0)
            System.out.println("They are in the 1st Quadrant");
        else if(coodX<0 && coodY>0)
            System.out.println("They are in the 2nd Quadrant");
        else if(coodX<0 && coodY<0)
            System.out.println("They are in the 3rd Quadrant");
        else if(coodX>0 && coodY<0)
            System.out.println("They are in the 4th Quadrant");
    }
}