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



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
        s=s.toLowerCase();
	     s=s.replaceAll(" ","");
		TreeSet<Character> tr=new TreeSet<Character>();
		char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++)
		{
            int b=(int)c[i];
            if(b>=97 && b<=122)
             {
                char r=(char)a;
		    tr.add(r);
            }
		}
		int a=tr.size();
		if(a==25)
		{
		    System.out.print("pangram");
		}
		else
	    System.out.print("not pangram");
    }
}
