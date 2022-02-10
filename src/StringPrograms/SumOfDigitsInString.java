package StringPrograms;

import java.util.Scanner;

public class SumOfDigitsInString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String s1=sc.nextLine();
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(Character.isDigit(c))
			{
				String temp=c+"";
				int num=Integer.parseInt(temp);
				sum+=num;
			}
			
		System.out.println("Sum of digits in string :"+sum);
		}
		
	}

}
