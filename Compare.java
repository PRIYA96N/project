import java.util.Scanner;

  public class Compare {

   public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    System.out.print("the number is ");
    int num = in.nextInt();
    if(num== 0)
    { 
        System.out.println("Number is zero");
        }
    else if(num> 0)
    { 
        System.out.println("Number is positive");
        }
    else 
    { 
        System.out.println("Number is negative");
        }
  }
 }
