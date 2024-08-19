import java.util.Scanner;;

public class reverse {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        int n=ab.nextInt();
         int rem=0;
        while (n>0) {
             rem =n%10;
            System.out.print(rem);    
            n=n/10;  
            // or it can be done by rem=rem*10+ans  
        }
        // System.out.println( ans );    
       
    }
    
}
