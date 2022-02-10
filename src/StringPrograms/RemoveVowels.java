package StringPrograms;

import java.util.Scanner;

public class RemoveVowels
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the string :");
		String s1=sc.next();
		System.out.println("enter the vowels");
		String s2=sc.next();
		//String s2="aeiou";
		String s3="";
		for(int i=0;i<s1.length();i++)
		{
			boolean b=false;
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					b=true;
				}
			}
				if(b==false)
				{
					s3=s3+s1.charAt(i);
					
				}
					
		}
		System.out.println(s3);
		
	}

}
