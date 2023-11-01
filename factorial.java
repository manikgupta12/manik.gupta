import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scan.nextInt();
        int r=1;
        while(n>1)
        {
        r=r*n;
        n=n-1;
        }
        System.out.println("result"+r);
        scan.close();
    }
}
