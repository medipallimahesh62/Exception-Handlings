package NumberPrograms;

import java.util.Scanner;

public class Fact 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value..");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The value of Fctorial is  "+fact);
		
	}

}
