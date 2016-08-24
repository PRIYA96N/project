

import java.util.*;
import java.lang.*;
import java.io.*;


class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int temp=0;
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b[]=new int[a];

	for(int i=0;i<a;i++)
	{
	    b[i]=sc.nextInt();
	}
		int k=sc.nextInt();
	for(int j=0;j<k;j++)
	{
	    for(int l=0;l<a-1;l++)
	    {
	        temp=b[l];
	        b[l]=b[l+1];
	        b[l+1]=temp;
	    }
	}
	for(int m=0;m<a;m++)
	{
	    System.out.println(b[m]);
	}
	}
}
