package class2;

public class typecasting {
    public static void main(String[] args) {
        char ch = 'A';
        int x = ch; //implicit typecasting
        System.out.println(x);

        char y = 'a';
        int z = (int)y;
        System.out.println(z);

        char b = '3';
        System.out.println(b);

        char ch1 = 'c';
        System.out.println(ch1+0);

        int x1 = 65;
        char ch2 = (char)x1;
        System.out.println(ch2);

        char space = ' ';
        int y1 = (int)space;
        System.out.println(y1);

        // int space1 = 32;
        // char y2 = (char)space1;
        // System.out.println(y2);

        int space1 = 32;
        char y2 = (char)space1;
        System.out.println(y2*y2);
    }
}