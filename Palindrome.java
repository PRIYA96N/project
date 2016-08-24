import java.util.*;
 public class Palindrome {
  public static void main(String[] args) { 
    Scanner rc = new Scanner(System.in);
    System.out.println("enter the number ");
    int n=rc.nextInt();
    int b=n,r;
    int a=0;
    while(n!=0)
    {
        r=n%10;a
        a=a*10+r;
        n=n/10;
    }
    if(b==a)
    {
    System.out.println("It is a palindrome");
    }
    else
    System.out.println("It is not a palindrome");
   }
   }
