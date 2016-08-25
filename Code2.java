import java.util.*;
import java.lang.*;
import java.io.*;
class Code2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    String s2[]=s1.split(" ");
	   for(String w:s2){  
	      String w1=w.substring(0,1).toUpperCase();
	      String st=w.substring(1);
      System.out.print(w1+st+" "); 
  }
	}
}
