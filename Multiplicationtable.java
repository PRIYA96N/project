import java.io.*;
import java.util.*;
public class Multiplicationtable{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int lim=sc.nextInt(),value=0;
        for(int i=1;i<=lim;i++)
        {
            value=i*a;
            System.out.println(i+"*"+a+"="+value);
        }
     }
}
