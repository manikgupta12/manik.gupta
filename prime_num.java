import java.util.Scanner;

public class Prime_num {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scan.nextInt();
        int i=2;
        int count=0;
        while(i<=n/2)
        {
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count==0){
        System.out.println("This is prime number:");
        }
        else{
        System.out.println("This is not prime number:");
        }
        scan.close();
    }
    
}
