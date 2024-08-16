import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter P ,I and R");
        int P=sc.nextInt();
        int T=sc.nextInt();
        int R =sc.nextInt();
        int SI=P*R*T/100;
        System.out.println("simple interest is " +SI);

    }
    
}
