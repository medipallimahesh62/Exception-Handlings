package demopack2;

public class InvalidMonthNumberException extends RuntimeException
{
  public String toString()
  {
	  return "demopack2.InvalidMonthNumberException: give monthnumber is bw 1 to 12";
  }
	

}
