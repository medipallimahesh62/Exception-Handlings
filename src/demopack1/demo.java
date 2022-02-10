package demopack1;
import java.util.Scanner;
public class demo 
{
	public static void main(String[] args) 
	{
		    Scanner sc=new Scanner(System.in);
			System.out.println("enter the 1st integer..");
			int a=sc.nextInt();
			System.out.println("enter the 2nd integer..");
			int b=sc.nextInt();
			int attempts=4;
			while(true)
			{
				try
				{
			
			System.out.println(a/b);
			break;
		}
		catch(Exception e)
		{
			attempts--;
			if(attempts==0)
			{
				attempts--;
				break;
			}
			System.out.println("re enter the number..");
			b=sc.nextInt();
		}
	}

  }
}
