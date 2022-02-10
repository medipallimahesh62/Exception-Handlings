package example1;

import java.util.Scanner;

public class exam1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter arry size");
		int n=sc.nextInt();
		int count=0;
		int a[]=new int[n];
		//System.out.println("enter the elemnts");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
