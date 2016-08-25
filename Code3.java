import java.util.*;
public class Code3{

     public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int s[]=new int[a];
       for(int i=0;i<a;i++)
       {
           s[i]=sc.nextInt();
       }
       for(int i=0;i<a;i++)
       {
           //System.out.println("a");
           if(s[i]==i)
           {
               System.out.println(s[i]);
           }
       }
     }
}
