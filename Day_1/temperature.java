import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter temperature in c:");

        float tempC =sc.nextFloat();
        float tempf=(tempC*9/5)+32;
        System.out.println(tempf);
    }
    
}
