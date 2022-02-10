package example1;

public class demo1 
{
	public static void main(String[] args) 
	{
		int count=0;
		String str1="medipalli and mahesh and rajesh";
		 String []str2=str1.split("and ");
		 for(int i = 1;i<str2.length;i++)
		 {
		    System.out.println(str2[i]);
		    count++;
		    
		 }
		 System.out.println(count);
	}

}
