import java.util.Scanner;

public class Invert_tri {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<5-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
