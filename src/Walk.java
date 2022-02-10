
public class Walk extends Thread 
{
     public void run()
     {
	     System.out.println("run 10km");
     }
     public static void main(String[] args) 
     {
    	 Walk w1=new Walk();
    	 w1.start();
		
	}
}


