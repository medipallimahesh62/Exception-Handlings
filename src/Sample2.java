
public class Sample2 implements Runnable
{
	public void run()
	{
		System.out.println("hi");
	}
	public static void main(String[] args) 
	{
		Sample2 s1=new Sample2();
		Thread t1=new Thread(s1);
		t1.start();
		
		 
	}
	

}
