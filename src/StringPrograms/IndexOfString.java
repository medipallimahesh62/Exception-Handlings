package StringPrograms;

import java.util.Scanner;

public class IndexOfString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String s1=sc.next();
		System.out.println("Enter the character to get index :");
		char ch=sc.next().charAt(0);
		int i=s1.indexOf(ch);
		System.out.println(ch+ "index position is :"+i);
		if(i==-1)
		{
			System.out.println(ch+" is not present");
		}
		else
		{
			System.out.println(ch+" is present");
		}
		
	}

}
