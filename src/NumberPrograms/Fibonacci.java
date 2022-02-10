package NumberPrograms;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  start number :");
	int n1=sc.nextInt();
	System.out.println("enter  end  number :");
	int endloop=sc.nextInt();
	int n2=n1+1;
	int n3=0;
	System.out.println(n1+" "+n2);
	for (int i=n1;i<=endloop;i++)
	{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
	}

    }
}
