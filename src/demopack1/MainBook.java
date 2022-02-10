package demopack1;

public class MainBook 
{
	public static void main(String[] args) 
	{
		Book b1=new Book();
		b1.setBookAuthor("Mahesh");
		b1.setBookPages(200);
		b1.setBookPrice(150.00);
		b1.setBookTitle("think like a monk");
		System.out.println(b1.getBookAuthor());
		System.out.println(b1.getBookPages());
		System.out.println(b1.getBookPrice());
		System.out.println(b1.getBookTitle());
	}

}
