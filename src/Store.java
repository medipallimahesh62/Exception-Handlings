public class Store 
{
	int item; 
	String itemName;
	double price;
	int stock;
	public Store(int item,String itemName,double price,int stock)
	{
		this.item=item;
		this.itemName=itemName;
		this.price=price; 
		this.stock=stock;
	}
	public Store() {
		
	}
	public void check(Store[] s,int item,int quantity)
		{
			for(int i=0;i<s.length;i++)
			{
				if(quantity<=s[i].stock && item==s[i].item)
				{
					System.out.println((float)(s[i].price*quantity)+"INR");
					System.out.println(s[i].stock-quantity+"LEFT");
				}
				else if(quantity>s[i].stock && item==s[i].item)
				{
					System.out.println("NO STOCK");
					System.out.println((s[i].stock)+"LEFT");
					
				}
			}
		}
	

}
