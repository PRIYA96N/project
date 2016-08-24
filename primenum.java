import java.util.*;
 public class Primeno {
  public static void main(String[] args) { 
    Scanner rc = new Scanner(System.in);
    System.out.println("enter the numbers ");
    int a=rc.nextInt();
    int b=rc.nextInt();
    int count=0;
    if(a==1)
    {
    a=a+1;
    }
    for(int i=a;i<=b;i++)
    {
        int c=0;
        for(int j=2;j<=i/2;j++)
          if(i%j==0)
          {
              c++;
          }
          if(c==0)
          {
              count++;
          }
    }
    System.out.println(count);
  
   }
   }
