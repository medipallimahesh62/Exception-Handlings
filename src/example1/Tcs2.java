package example1;

import java.util.Scanner;

public class Tcs2
{
	public static void main(String[] args) 
	{
		
		System.out.println(add());
	}
	public static int add()
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the N value");
		int N=sc.nextInt();
		int []a1=new int[N];
		System.out.println("enter the elements..");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		for(int i=0;i<a1.length;i++)
		{
			for(int j=i+1;j<a1.length;j++)
			{
				if(a1[i]+a1[j]==N)
				{
					count++;
				}
			}
		}
		return count;
		
	}

}
