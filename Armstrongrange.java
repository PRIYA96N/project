import java.util.*;
public class Armstrongrange{

     public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
        int c=sc.nextInt();
       int s=0,b=0,d=0;
       for(int i=a;i<=c;i++)
       {d=i;
       s=0;
       while(d!=0)
       {
           b=d%10;
           s=s+b*b*b;
           d=d/10;
       }
       if(s==i)
       System.out.println(s);
       
       
     }}
}
