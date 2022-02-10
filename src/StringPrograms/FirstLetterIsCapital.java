package StringPrograms;

import java.util.Scanner;

public class FirstLetterIsCapital 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		String Capitalize=Capital(s1);
		System.out.println(Capitalize);
	}
	public static String Capital(String s1)
	{
		String sArr[]=s1.split(" ");
		String modify="";
		for(int i=0;i<sArr.length;i++)
		{
			String temp=sArr[i];
			char ch[]=temp.toCharArray();
			char first=ch[0];
			ch[0]=Character.toUpperCase(first);
			modify=modify+new String(ch)+"";
		}
		return modify;
	}

}
