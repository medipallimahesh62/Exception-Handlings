package demopack1;

public class Calender 
{
	private int MonthNumber;
	public int getMonthNumber()
		{
			return MonthNumber;
		}
	public void setMonthNumber(int monthNumber)
	{
		this.MonthNumber=monthNumber;
		if(monthNumber>=1 && monthNumber<=12)
		{
			System.out.println("validation is successfull");
		}
		else
		{
			System.out.println("invalid validation");
		}
	}
		 
	

}
