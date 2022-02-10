package StringPrograms;

import java.util.Scanner;

public class WithoutCharAtReverseString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string :");
		String s1=sc.next();
		String temp="";
		char[] ch=s1.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			temp=temp+ch[i];
		}
		System.out.println(temp);
	}

}
