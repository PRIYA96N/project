import java.util.*;
public class Stringrev{

     public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String str=new StringBuffer(s).reverse().toString();
      System.out.println(str);
     }
}
