import java.util.*;
 public class For {
  public static void main(String[] args) { 
    Scanner rc = new Scanner(System.in);
    int n=rc.nextInt();
    int a,b=0;
    for(int i=0;i<n;i++)
    {   
        a=rc.nextInt();
        b+=a;
        
    }
   System.out.println(b);
   }
   }
