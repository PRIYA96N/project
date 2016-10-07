import java.io.*;
import java.util.*;
public class Zeros{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[][]=new int[a][a];
        int c[][]=new int[a][a];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                b[i][j]=sc.nextInt();
               
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(b[i][j]==0)
                {
                    for(int k=j-1;k>=0;k--)
                    {
                        c[i][k]=0;
                    }
                    for(int k=j+1;k<a;k++)
                    {
                        c[i][k]=0;
                    }
                    for(int l=i+1;l<a;l++)
                    {
                        c[l][j]=0;
                    }
                    for(int l=i-1;l>=0;l--)
                    {
                        c[l][j]=0;
                    }
                }
                else
                c[i][j]=b[i][j];
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
     }
}
