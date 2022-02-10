package demopack1;

public class Book 
{
	private String BookTitle;
	private String BookAuthor;
	private int  BookPages;
	private double BookPrice;
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.BookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.BookAuthor = bookAuthor;
	}
	public int getBookPages() {
		return BookPages;
	}
	public void setBookPages(int bookPages) {
		this.BookPages = bookPages;
	}
	public double getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.BookPrice = bookPrice;
	}

}
