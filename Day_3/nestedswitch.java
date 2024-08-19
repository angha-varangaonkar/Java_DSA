import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empID =sc.nextInt();
        String department=sc.next();

        switch (empID) {
            case 1:
                System.out.println("angha ");
                break;
            case 2:
                System.out.println("jimmy ");
                break;
            case 3:
            System.out.println("emp number 3");
               switch (department) {
                case "IT":
                    System.out.println("IT department");
                    break;
                case"Management":
                     System.out.println("management department");
                    break;
                default:
                    System.out.println("no deparment found");
                    break;
               }
                break;
            default:
            System.out.println("no emp ID found");
                break;
        }
    }
    
}
