import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int balance=5000,widthraw,deposit;
        while(true) {
        System.out.println("");
        System.out.println("Enter the 1 for check your balance:");
        System.out.println("Enter the 2 for  deposit:");
        System.out.println("Enter the 3  widthraw:");
        System.out.println("enter 4 for exit");
        int choice=scan.nextInt();
        switch(choice)
        {
            case 1:{
                System.out.println("your balance="+balance);
                break;
            }
            case 2:{
                System.out.println("Enter the amount for deposit:");
                deposit=scan.nextInt();
                balance=balance+deposit;
               // int balance=res;
                System.out.println("now your total amount is:"+balance);
                break;
            }
             case 3:{
                System.out.println("Enter the amount for widthraw:");
                widthraw=scan.nextInt();
                if(balance>=widthraw){
                balance=balance-widthraw;
                System.out.println("now your total amount is:"+balance);
                }
                else{
                    System.out.println("Insufficient amount");
                }
                break;
            }
            case 4:{
                System.exit(0);
            }
        }
         
         scan.close();
        }
    }
}  

