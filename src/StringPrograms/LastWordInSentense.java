package StringPrograms;

import java.util.Scanner;

public class LastWordInSentense 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner( System.in);
		System.out.println("enter the string:");
		String s1=sc.nextLine();
		String[] s2=s1.split(" ");
		String lastword=s2[s2.length-1];
		System.out.println(lastword);
		
		
	}
}
