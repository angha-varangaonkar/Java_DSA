import java.util.Scanner;

public class switchcase3 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String fruit =sc.next();

        // alt+enter 
        switch (fruit) {
            case "mango"->System.out.println("king of fruit");            
            case "apple"-> System.out.println("a sweet red fruit");
            case "orange"-> System.out.println("round fruit");
            case "grapes"-> System.out.println("small fruit");
            default->System.out.println("invalid fruit");
        } 
    }
    
    
}
