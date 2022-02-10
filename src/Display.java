
public class Display extends Thread 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		Sample t1=new Sample(d,"mahesh");
		Sample t2=new Sample(d,"rajesh");
		t1.start();
		t2.start();
	}
}
class Sample extends Thread
{
	Demo d;
	String name;
	Sample(Demo d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class Demo
{
	public  synchronized void  wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("GoodMrng :");
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
			}
			System.out.println(name);
		}
	}
	
}

