package example1;

import java.util.Base64;
import java.util.Scanner;

public class TCS
{
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.next();
		System.out.println("enter the 2 string");
		String s2=sc.next();
		String ds="";
		String es="";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if((c>='a' && c<='z') || (c>='A' && c<='Z'))
			{
				int a=c;
				a=a+5;
				char b=(char)a;
				ds+=b;
			}
			else if(c==' '||c==','||c=='.')
			{
				ds+=c;
			}
			else
			{
				count=1;
			}
		}
		for(int i=0;i<s2.length();i++)
		{
			int a=s2.charAt(i);
			a=a-5;
			char c=(char)a;
			es=es+c;
		}
		if(count==1)
		{
			System.out.println("invalid output");
		}
		else
		{
			System.out.println(s1 +" : "+ds );
			System.out.println(s2 +" : "+es );
		}
    }
}
