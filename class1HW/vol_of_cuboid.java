package class1HW;

public class vol_of_cuboid {
    public static void main(String[] args) {
        double l = 5;
        double b = 6;
        double h = 7;
        double vol = l*b*h;
        double surfaceArea = 2*(l*b + b*h + l*h);
        System.out.println(vol);
        System.out.println(surfaceArea);
    }
}