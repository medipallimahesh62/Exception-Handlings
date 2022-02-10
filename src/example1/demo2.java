package example1;

public class demo2 
{
	public static void main(String[] args) 
	{
		int count=0;
		String str="mahesh medipalli";
		String str1[]=str.split("m");
		for(int i=1;i<=str1.length-1;i++)
		{
			System.out.println(str1[i]);
			count++;
		}
		System.out.println(count);
		
	}

}
