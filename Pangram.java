import java.util.*;
import java.lang.*;
import java.io.*;
class pangram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	     s=s.replaceAll(" ","");
		TreeSet<Character> tr=new TreeSet<Character>();
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{  
		    tr.add(c[i]);
		    
		}
		int a=tr.size();
		if(a==25)
		{
		    System.out.print("It is a pangram");
		}
		else
	    System.out.print("It is not a pangram");
	}
}
