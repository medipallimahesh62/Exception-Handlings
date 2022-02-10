package StringPrograms;

import java.util.Scanner;

public class CountThewordsInSentence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the sentence..");
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		System.out.println("count the total words in sentence :"+s1.length);
		
	}

}
