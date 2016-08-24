import java.util.*;
 public class Digit {
  public static void main(String[] args) { 
    Scanner rc = new Scanner(System.in);
    int n=rc.nextInt();
    int b=0;
    while(n!=0)
    {
        n=n/10;
        b++;
    }
   System.out.println(b);
   }
   }
