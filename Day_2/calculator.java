import java.util.Scanner;;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // take input till user does not say Xor x
        int ans=0;
        while (true) {
         System.out.println("enter the operator");
        char op= sc.next().trim().charAt(0);  
        
       
        if (op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {
            System.out.println("enter two number");
            int num1= sc.nextInt();
            int num2 =sc.nextInt();
            System.out.println();

            if (op=='+') {
                ans=num1+num2;
            }
            if (op=='-') {
                ans=num1-num2;
            }
            if (op=='*') {
                ans=num1*num2;
            }
            if (op=='/') {
                if(num2 != 0)
                  ans=num1/num2;
            }
            if (op=='%') {
                ans=num1%num2;
            }
        }
        else if (op =='X' || op=='x') {
            break;
            
        }
        else
        {
            System.out.println("invalid operation");
        }
        System.out.println(ans);
        }
        
    }
    
}
