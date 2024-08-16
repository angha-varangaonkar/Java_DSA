import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the operation (+,-,*,/) you want to perform ");
        char operator=sc.next().charAt(0);
        System.out.println("enter the numbers ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if (operator =='+') {
            System.out.println(" the addition is " +( num1+num2));
            
        } 
        else if(operator =='-') {
            System.out.println("the subtraction is " +( num1 -num2));
            
        }


        else if(operator =='*') {
            System.out.println("the multiplication is " +(num1*num2));
            
        }

        else if(operator =='/') {
            System.out.println("the division is " +(num1/num2));
            
        }



        
    }
    
}
