package StringPrograms;

import java.util.Scanner;

public class SubstringOfstring 
{ 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string..");
		String string=sc.nextLine();
		System.out.println("enter the substring to search...");
		String substring1=sc.next();
		if(string.contains(substring1))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
