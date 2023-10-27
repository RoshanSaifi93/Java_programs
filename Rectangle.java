import java.util.Scanner;

public class Rectangle{
  static int input(String opr){
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the "+opr+" value");
     num=sc.nextInt();
    //sc.close(); this commented i call  this 2 times so in one time its object creted and delted
    return num;
  }

  static void recatngle(int l,int b ){
     System.out.println("Area is:"+l*b);
    System.out.println("Perimetr is:"+(2*(l+b)));
     
  }

  public static void main(String[] arg) {
    //  int l=input("Length");
    //  int b=input("Breadth");
    //  recatngle(l,b);
     recatngle(input("Length"),input("Breadth"));
    
  }
}