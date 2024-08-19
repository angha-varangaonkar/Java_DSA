import java.util.Scanner;
public class largest3 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        int a=ab.nextInt();
        int b=ab.nextInt();
        int c=ab.nextInt();

        // Math.max is used to  find the largest number 
        int max= Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
    
}
