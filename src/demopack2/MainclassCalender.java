package demopack2;
import java.util.*;
public class MainclassCalender 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		CalenderException c1=new CalenderException(5);
		int MonthNumber=sc.nextInt();
		//c1.setMonthNumber(MonthNumber);
     	for(int i=5;i>=0;i--)
		{
     		try
     		{
     		MonthNumber=sc.nextInt();
     		c1.setMonthNumber(MonthNumber);
     		System.out.println(c1.getMonthNumber());
     		break;
     		}
     		catch(InvalidMonthNumberException e)
     		{
     			if(i==0)
     			{
     				System.out.println("stop");
     			}
     			
     			System.out.println(e);
     			
     			//MonthNumber=sc.nextInt();
     			//System.out.println(MonthNumber);
     			System.out.println(i);
     			System.out.println("re enter the valid monthnumber");
     			
     		}
     		catch(InputMismatchException rv)
     		{
     			
     		}
     		
		}
		
		
	}
	

}
