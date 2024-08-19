import java.util.Scanner;

public class largest2 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        int a=ab.nextInt();
        int b=ab.nextInt();
        int c=ab.nextInt();

        int max=a;
        if (b>max) {
            max=b;
            
        }
        if (c>max) {
            max=c;
        }
        System.out.println(max);

    }
    
}
