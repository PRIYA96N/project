import java.util.*;
public class Seed{

     public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      int y=sc.nextInt();
      int b=a.length();
      int c=Integer.parseInt(a);
      int e=c,f;
      f=c;
      int d[]=new int[b];
      int i=0;
      while(c!=0)
      {
          if(i!=b)
          {
              d[i]=c%10;
              c=c/10;
              i++;
          }
      }
      int j=0;
      for(j=0;j<b;j++)
      {
          e=e*d[j];
      }
      if(e==y)
      System.out.print("It is a seed");
      else
      System.out.print("It is not a seed");
     }
}
