package StringPrograms;
import java.util.Scanner;
import demopack4.main;
public class RemoveSpacesWithOutSplit 
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Ënter String : ");
	String s1=sc.nextLine();
	String s2 = s1.replace(" ","");
	System.out.println(s2);
	}
}
