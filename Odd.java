import java.util.*;
 public class Odd {
  public static void main(String[] args) { 
    Scanner rc = new Scanner(System.in);
    System.out.println("enter the numbers ");
    int a=rc.nextInt();
    int b=rc.nextInt();
    for(int i=a;i<=b;i++)
    {
        if(i%2!=0)
          System.out.println(i);
    }
  
   }
   }
