package StringPrograms;

import java.util.Scanner;

public class zoho 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence..");
		String s1=sc.nextLine();
		String s[] = s1.split(" "); 
	      String ans =""; 
	      for (int i = s.length - 1; i >= 0; i--)
	      { 
	        ans=ans+ s[i] + " "; 
	      } 
	      System.out.println("Reversed String: " + ans); 
	}

}
