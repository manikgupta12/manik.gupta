public import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length and breadth:");
        int l =scan.nextInt();
        int b=scan.nextInt();
        int area =l*b;
        System.out.println("area calculated is " + area);
        scan.close();
    }
}
{
    
}
