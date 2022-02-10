package demopack1;
import java.io.File;
import java.util.*;
public class demo2 
{
	public static void main(String[] args) 
	{
		File f1=new File("C:\\data\\aaa.txt");
		//File f2=new File("i am fresher");
		try
		{
			boolean res=f1.createNewFile();
			//boolean res1=f2.canWrite();
			System.out.println(res);
			//System.out.println(res1);
		}
		catch(Exception e)
		{
			System.out.println("Exception is caught");
			System.out.println("file is created....");
		}
		
	}

}
