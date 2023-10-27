import java.util.Scanner;

public class Interst {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal Value");
        int p;
        p=sc.nextInt();
         System.out.println("Enter Rate ");
        int r;
        r=sc.nextInt();
         System.out.println("Enter Time ");
        int t;
        t=sc.nextInt();
        System.out.print("Result is :");
        System.out.print((p*r*t)/100);

        sc.close();
    }
}
