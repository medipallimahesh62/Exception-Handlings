package example1;

public class methodoveride 
{
	public String  flipkart()
	{
		return "coins";
	}

}
class Override extends methodoveride
{
	public String amazon()
	{
		return "prime";
	}
}
class Override2 extends Override
{
	public String ajio()
	{
		return "coupon";
	}
}
