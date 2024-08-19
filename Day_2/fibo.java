import java.util.Scanner;;

public class fibo {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0;
      int b=1;
      for(int count=2;count<=n;count++)
      {
        int temp=b;
        b=b+a;
        a=temp;
        System.out.println(b);
      } 
    //   System.out.println(b); 
    }
    
}
