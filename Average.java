/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Average
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b[]=new int[a];
	int c=(a/2)+1;
	int d=0,e=0;
	for(int i=0;i<c;i++)
	{
	    b[i]=sc.nextInt();
	    d=d+b[i];
	}

	for(int j=a-1;j>=c;j--)
	{
	    b[j]=sc.nextInt();
	    e=e+b[j];
	}
		d=d/c;

	e=e/(a-c);
	if(d==e)
	{
	    System.out.println("possible");
	}
	else
	System.out.println("not possible");
	}
}
