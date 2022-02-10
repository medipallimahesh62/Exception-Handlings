package StringPrograms;

import java.util.Scanner;

import demopack4.main;

public class StringReverse
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s1 = s.next();
		String s2 = "";
		for(int i = s1.length()-1;i>=0;i--)
		{
			s2 = s2+s1.charAt(i);
		}
		System.out.println(s2);
	}
}
