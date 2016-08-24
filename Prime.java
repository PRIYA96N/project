import java.util.*;
 public class Prime {
  public static void main(String[] args) { 
    Scanner rc = new Scanner(System.in);
    System.out.println("enter the number ");
    int n=rc.nextInt();
    int a=0;
    for(int i=2;i<=n/2;i++)
    {
        if(n%i==0)
        {
            a++;
        }
    }
    if(a>0)
    {
        System.out.println("it is not a prime number");
    }
    else 
    System.out.println("it is a prime number");
   }
   }
