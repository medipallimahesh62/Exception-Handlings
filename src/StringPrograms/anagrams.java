package StringPrograms;

import java.util.*;

public class anagrams 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string1...");
		String s1=sc.next();
		System.out.println("enter the string2..");
		String s2=sc.next();
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean res=isAnagram(ch1,ch2);
		System.out.println((res)? " Given string Anagram":"Not anagram");
		
			
	}
	public static boolean isAnagram(char ch1[],char ch2[])
	{
		if(ch1.length-1!=ch2.length-1) 
		{
			return false;
			
		}
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				return false;
			}
		}
		return true;
	}

}
