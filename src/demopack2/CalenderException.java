package demopack2;
import java.io.*;
public class CalenderException
{
	private int MonthNumber;
	public CalenderException(int MonthNumber)
	{
	    setMonthNumber(MonthNumber);
	}
	public int getMonthNumber()
	{
		return this.MonthNumber;
	}
	public void setMonthNumber(int MonthNumber)
	{
		if(MonthNumber>=1 && MonthNumber<=12)
		{
			this.MonthNumber=MonthNumber;
			//System.out.println("valid");
		}
		else 
		{
			throw new InvalidMonthNumberException();
		}
	}

}
