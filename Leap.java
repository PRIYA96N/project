import java.util.Scanner;
 public class Leap {
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int a=in.nextInt();
    
    if(a%4==0)
    { 
        if(a%100==0)
        {
        if(a%400==0)
        System.out.println("It is a leap year");
        else
        System.out.println("It is not a leap year");
        }
        else
        System.out.println("It is a leap year");
    }
    else 
    { 
        System.out.println("It is not a leap year");
    }
    
   }
   }
