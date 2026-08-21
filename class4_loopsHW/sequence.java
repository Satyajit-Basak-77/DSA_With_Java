package class4_loopsHW;

public class sequence {
    public static void main(String[] args) {
        int a=1;
        int b=5;
        for(int i=0; i<10; i++){
            if(i%2 == 0){
                System.out.println(a);
                a++;
            } else{  
                System.out.println(b);
                b--;
            }
        }
    }
}
