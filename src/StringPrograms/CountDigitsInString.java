package StringPrograms;

import java.util.Scanner;
//to count the no of digits inbuilt method is isDigit(ch);
public class CountDigitsInString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String..");
		String s1=sc.nextLine();//to read the sentence from the user  
		String s2="0123456789";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			for(int j=0;j<s1.length();j++)
			{
				if(ch==s2.charAt(j))
				{
					count++;
				}
			}
		}
		System.out.println(count);
		
		
	}

}
