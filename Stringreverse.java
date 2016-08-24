import java.util.*;
public class Stringreverse{

     public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String str=new StringBuffer(s).reverse().toString();
      System.out.println(str);
      String st=str.replaceAll("[aeiouAEIOU]","");
      System.out.println(st);
     }
}
