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
     
      System.out.println(d[46]);
    \
      System.out.println(d[z]);
      }
     }
}
