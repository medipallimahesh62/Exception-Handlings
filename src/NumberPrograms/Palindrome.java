package NumberPrograms;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int r=0; 
		int temp=n;
		  while(n>0)
		  {
			  int s=n%10;
			  n=n/10;
			  r=(r*10)+s;   
		  } 
		  if(r==temp) {
			  System.out.println("is palindrome");
		  }
		  else
		  {
		  System.out.println("is not palindrome");
		  }
	}

}
