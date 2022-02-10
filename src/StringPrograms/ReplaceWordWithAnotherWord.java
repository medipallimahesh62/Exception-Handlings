package StringPrograms;

import java.util.Scanner;

public class ReplaceWordWithAnotherWord 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the string..");
		String givenstring=sc.nextLine();
		System.out.println("ENter the old word to rplace..");
		String oldword=sc.next();
		System.out.println("enter the new word to replace");
		String newword=sc.next();
		String originalstring=givenstring.replace(oldword, newword);
		System.out.println(originalstring);
		
		
		
	}

}
