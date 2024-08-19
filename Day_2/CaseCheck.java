import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        // trim is used for extra number 
        // charAt(0) it shows the character at index 0

        Scanner sc=new Scanner(System.in);
        char ch =sc.next().trim().charAt(0);
        if (ch>='a'&& ch<='z') {
            System.out.println("letter is in lower case ");
            
        } else {
            System.out.println("letter is in upper case ");
            
        }

        
    }
    
}
