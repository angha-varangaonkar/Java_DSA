import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner bc=new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("enter the numer till where u want to get the febonica series ");
        // System.out.println(b);
        int num =bc.nextInt();
        int count=2;
        while (count<=num) {
            int temp=b;
            b=b+a;
            
            a=temp;
            
            count++;
            System.out.print(" "+b);
        }
    }

    
    
}
