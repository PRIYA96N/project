import java.util.*;
public class Code4{

     public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      
      String a=sc.nextLine();
      int z=sc.nextInt();
      int b=a.length();
      int c=Integer.parseInt(a);
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
      for(int e=0;e<b;e++)
      {
          for(int f=e+1;f<b;f++)
          {
          if(d[e]>d[f])
          {
              int temp=d[e];
              d[e]=d[f];
              d[f]=temp;
          }
          
      } 
          
      }
      z=b-z;
      for(int y=0;y<z;y++)
      {
          System.out.print(d[y]);
      }
     }
}
