import java.util.*;
public class First{

     public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int z=sc.nextInt();
      int d[]=new int[z];
      int a[]=new int[z];
      int k=0,count=0;
     for(int i=0;i<z;i++)
     {
         d[i]=sc.nextInt();
     }
     Arrays.sort(d);
      for(int e=0;e<z;e++)
      {
          for(int f=e+1;f<z;f++)
          {
          if(d[e]==d[f])
          {
             a[k]=d[e];
             k++;
            count=1;
          }
      } 
          
      }
      if(count==1)
     System.out.print(a[0]);
     else
     System.out.print("No value is repeated");
     
     }
}
      int a[]=new int[a];
      int k=0;
     for(int i=0;i<z;i++)
     {
         d[i]=sc.nextInt();
     }
     Arrays.sort(d);
      for(int e=0;e<z;e++)
      {
          for(int f=e+1;f<z;f++)
          {
          if(d[e]==d[f])
          {
             a[k]=d[e];
             k++
            
          }
      } 
          
      }
     System.out.print(a[0]);
     }
}
