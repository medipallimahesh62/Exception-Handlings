package StringPrograms;

import java.util.Scanner;

public class WithoutChangeSpaceReverseString 
{
	public static String space(String s1) 
	{
		char[] ch=s1.toCharArray();
		int start=0; int end=ch.length-1;
		while(start<end)
		{
			char first=ch[start];
			char last=ch[end];
			if(first==' ')
			{
				start++;
			}
			else if(last==' ')
			{
				end--;
				 
			}
			else
			{
				char temp=first;
				ch[start]=last;
				ch[end]=temp;
				start++;
				end--;
			}
		}
		s1=new String(ch);
		return s1;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string :");
		String s1=sc.nextLine();
		String rev=space(s1);
		System.out.println(rev);
		
	}

}
