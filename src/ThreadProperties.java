
public class ThreadProperties 
{
	public static void main(String[] args) 
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		t1.setName("This is main thread");
		t1.setPriority(2);
		System.out.println("Modified thread propertiesa are...");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
	}

}
