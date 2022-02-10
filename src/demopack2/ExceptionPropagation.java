package demopack2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ExceptionPropagation 
{
	public static void main(String[] args) 
	{
		try
		{
			createFile();
		}
		catch(IOException e)
		{
			System.out.println("Exception is caught");
		}
	}
	private static void createFile() throws IOException 
	{
		//FileReader f2=new FileReader("src/jspiders");
		//Properties p1=new Properties();
		File f1=new File("C:\\data\\mahesh.txt");
		f1.createNewFile();
		System.out.println(f1.createNewFile());
		//p1.load(f2);
		//String s1=p1.getProperty("mahesh");
		//System.out.println(s1);
		
	}
	

}
