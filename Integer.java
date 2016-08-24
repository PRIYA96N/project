import java.util.*;
public class Integer{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=0;
         int c=0;
         while(a!=0)
         {
          c=a%10;
          b=b*10+c;
          a=a/10;
          
         }
         System.out.println(b);
    
     }
}
