import java.util.Scanner;

public class first {
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.println("please enter some input");
       int rollno =input.nextInt();
       System.out.println("your roll number is "+rollno);
       
       
       String name =input.next();
       System.out.println(name);

       float marks=input.nextFloat();
       System.out.println(marks);
    }
    
}
// int a=10;
// 10 is literal and a is identifier 
