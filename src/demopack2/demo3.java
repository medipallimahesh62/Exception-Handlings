package demopack2;

public class demo3 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts..");
		try
		{
			test();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is caught and recovered..");
		}
		System.out.println("main ends..");
		
	}
	public static void test()
	{
		int a=10;
		int b=0;
		System.out.println(a/b);
	}

}
