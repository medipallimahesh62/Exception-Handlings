package StringPrograms;

import java.util.Scanner;

public class Lastfirstlettersimilar
{
	  public static void main(String[] args)
	  {
		  String str="noon";
		  int count=0;
		  char ch=str.charAt(0);
		  for(int i=0;i<=str.length()-1;i++)
		  {
			  if(str.charAt(i)==str.charAt(str.length()-1))
				  {
					  count++;
				  }
			  
		  }
			  System.out.println(count);
			  if(ch==-1)
			  {
				  System.out.println("0");
			  }
	  }
}


