import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner ab =new Scanner(System.in);
        float value =ab.nextFloat();
        System.out.println("The Amount you entered in Ruppes is : " + value);
        double valueusd = value * 0.012 ;
        System.out.println("The amount converted in USD is "+ valueusd );

    }
    
}
