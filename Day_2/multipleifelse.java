public class multipleifelse {
    public static void main(String[] args) {
        int salary=2500;
        if (salary>10000) {
            salary+=2000;
            
        }
        if (salary>2000) {
            salary+=1000;
        } else {
            salary+=500;
        }
        System.out.println(salary);
    }
    
}
