package StringPrograms;

import java.util.Scanner;
 
public class ReplaceCharWithAnother 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the string");
		String s1=sc.next();
		System.out.println("Enter the old char :");
		char ch=sc.next().charAt(0);
		System.out.println("Enter the replace char :");
		char ch1=sc.next().charAt(0);
		String s2=s1.replace(ch, ch1);
		System.out.println(s2);
		
	}

}
