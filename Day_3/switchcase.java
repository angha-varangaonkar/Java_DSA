import java.util.Scanner;

public class switchcase {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String fruit =sc.next();
        //without using switch if we use if else then 
       
    //    .equal is used to compare eg same as fruit==mango
        if (fruit.equals("mango"))
        {
            System.out.println("king of fruit");
        }
        // else is not required we can write or ignore it 
        if (fruit.equals("apple")) {
            System.out.println(" a sweet red fruit");
        }
        // in this situation switch is more suitable bcoz ever time it will check the if statement and it will give the answer 
        // and if we use switch it will directly jump to that case so this will decrease the time complexity
        
    }    
}
/*Syntax:
 * switch(expression){
 * case one:
 *   //do something
 *    break;
 * case one:
 *   //do something
 *    break;
 * default:
 * //do something
 * }
 * 
 * 
 * 
 * 
 * rules:
 * 1. cases have to be the same type as expressions ,must be constant or literalsz
 * 2.duplicate case values are not allowed
 * 3. break is use to terminate the sequence
 * 4. if break is not used ,it will continue to next case 
 * 5. default will execute when none of the above does 
 * 6.if default is not at the end , put break after it 
 * 
 * 
 */