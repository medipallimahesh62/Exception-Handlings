import java.util.Scanner;

public class StoreMain 
{
	public Store[] s;
	public StoreMain(Store[] s)
	{
		this.s=s;
	}
	public static void main(String[] args) 
	{
		Store[] s1= {new Store (101,"milk",42,10),
					new Store(102,"cheese",50,20),
					new Store(103,"Ghee",500,15),
					new Store(104,"bread",40,16)};
		StoreMain st=new StoreMain(s1);
		Scanner sc=new Scanner(System.in);
		Store s=new Store();
		try {
			System.out.println("enter the items");
			int item=sc.nextInt();
			System.out.println("enter quantity");
			int quantity=sc.nextInt();
			s.check(s1,item,quantity);
		}
		catch(Exception e)
		{
			System.out.println("INVALID OUTPUT");
		}
	}

}
