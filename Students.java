import java.util.*;
public class Students{

     public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int d[]=new int[50];
      int z=sc.nextInt();
     for(int i=0;i<50;i++)
     {
         d[i]=sc.nextInt();
     }
     Arrays.sort(d);
      for(int e=49;e<=0;e++)
      {
      if(e==46)
      System.out.println(d[e]);
      if(e==z)
      System.out.println(d[e]);
      }
     }
}
