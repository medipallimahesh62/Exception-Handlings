package StringPrograms;

import java.util.Scanner;

public class CheckWordInString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string...");
		String s1=sc.nextLine();
		System.out.println("find the word in a string..");
		String s2=sc.next();
		if(s1.contains(s2))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
