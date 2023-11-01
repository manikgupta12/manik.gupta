import java.util.scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=scan.nextInt();
        System.out.println("Enter the second number:");
        
        int b=scan.nextInt();
        System.out.println("Enter the 1 for addition:");
        System.out.println("Enter the 2 for subtrection:");
        System.out.println("Enter the 3 for multiplication:");
        System.out.println("Enter the 4 for division:");
        int choice=scan.nextInt();
        switch(choice)
        {
            case 1:{
                int rs= a+b;
                System.out.println("your result=" +rs);
                break;
            }
            case 2:{
                int rs=a-b;
                System.out.println("your result is="+rs);
                break;
            }
            case 3:{
                int rs=a*b;
                System.out.println("your result is="+rs);
                break;
            }
            case 4:{
                int rs=a/b;
                System.out.println("your result is="+rs);
                break;
            }
            default:{
                System.out.println("invalid operation");
            }
        }
        scan.close();
    }
}
