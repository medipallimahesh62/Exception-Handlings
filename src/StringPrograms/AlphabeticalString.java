package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String s1=sc.next();
		char ch[]=s1.toCharArray();
		Arrays.sort(ch);
		System.out.println(new String(ch));
		
	}

}
