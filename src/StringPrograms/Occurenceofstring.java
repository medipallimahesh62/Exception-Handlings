package StringPrograms;

import java.util.Scanner;

public class Occurenceofstring 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		String temp="";
		for(int i=0;i<s1.length();i++)
		{ 
			int index=temp.indexOf(s1.charAt(i));
			if(index==-1)
			{
				temp=temp+s1.charAt(i);
			}	
		}
		for(int i=0;i<=temp.length()-1;i++)
		{
			int count=0;
			
			for(int j=i;j<=s1.length()-1;j++)
			{
				if(s1.charAt(j)==temp.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(temp.charAt(i));
			}
			
		}
		
	}

	

}
