import java.util.Scanner;

public class switchcase2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String fruit =sc.next();
        switch (fruit) {
            case "mango":
                System.out.println("king of fruit");
                break;
            
            case "apple":
                System.out.println("a sweet red fruit");
                break;
            
            case "orange":
                System.out.println("round fruit");
                break;
            
            case "grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("invalid fruit");
                break;
        } 
    }
    
}
