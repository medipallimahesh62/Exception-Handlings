package StringPrograms;

import java.util.Scanner;

public class LengthOfString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next();
		char[]ch=s1.toCharArray();
		int len=0;
		for (char c : ch)
		{
			len++;
		}
		System.out.println(len);
	}
	/*another logic is using while loop 
	 int index=0;
	 while(true)
	 {
	 try{
		 s1.charAt(index);
		 index++;
		 length++;
	    }
	    catch(SOBE e)
	   {
	    break;
	   }
	 }*/
	

}
