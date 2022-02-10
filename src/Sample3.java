
public class Sample3 extends Thread
{
	public static void main(String[] args) 
	{
		Sample3 s1=new Sample3();
		s1.start();
		
	}
	public void run()
	{
		test();
	}
	public void test()
	{
		System.out.println("test a car");
	}

}
