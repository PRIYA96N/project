import java.util.*;
public class Big{

     public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b[]=new int[a];
    for(int i=0;i<a;i++)
    {
        b[i]=sc.nextInt();
    }
    Arrays.Sort(b);
      for(int y=b-1;y>=0;y--)
      {
          System.out.print(b[y]);
      }
     }
}
