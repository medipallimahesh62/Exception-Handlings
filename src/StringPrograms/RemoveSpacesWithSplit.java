package StringPrograms;

import java.util.Scanner;

public class RemoveSpacesWithSplit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String s1=sc.nextLine();
		String[] s2=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			System.out.print(s2[i]);
		}
		
		
	}

}
