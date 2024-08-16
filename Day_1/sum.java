import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();

        int sum=num1+num2;
        System.out.println("sum is "+sum);
    }
    
}
// lager =smaller for type conversion
// flot = int 
// int =float not possible 
// type casting 
// int num=(int)(67.56f);
// sop (num); ans will be 67
// int a=257;
// byte b=(byte)(a);here it is doing 257%256=1 and the ans is also 1
// bcoz byte only accepts 256 
/*byte a=40;
byte b=50;
byte c=100;
int d=a*b/c;
sop(d);
 * it will give the answer 20 bcz when we perform thes exoresions java acto matecially converts in integer
 * therefore byte b=50
 * b=b*3; it is not possible 
 */


//  int num='A'
// sop("A") it WILL GIVE 65 AS ASCII VALUE 
// JAVA FOLLOWS UNICODE value 
//int *float = float
