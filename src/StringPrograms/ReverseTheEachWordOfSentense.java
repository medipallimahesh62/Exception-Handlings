package StringPrograms;

import java.util.Scanner;

public class ReverseTheEachWordOfSentense
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence..");
		String s1=sc.nextLine();
		String[] s2=s1.split(" ");    
		for(int i=0;i<s2.length;i++)
		{
			String temp="";
			for(int j=s2[i].length()-1;j>=0;j--)
			{
				temp=temp+s2[i].charAt(j);
			}
			System.out.print(temp+" ");
		}
				
	}

}
