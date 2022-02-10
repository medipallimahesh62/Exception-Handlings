package StringPrograms;

import java.util.Scanner;

public class removerepeat 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string..");
		String s1=sc.next();
		String s2="";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{ 
			char ch=s1.charAt(i);
			int index=s2.indexOf(ch);
			if(index==-1)
			{
				s2=s2+ch;
			}
			else
			{
				count++;
			}
		}
		System.out.println(s2+":"+count);
		
		
	}

}
