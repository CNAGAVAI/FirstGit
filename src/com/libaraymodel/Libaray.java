package com.libaraymodel;

public class Libaray {
	private int BookId;
	private int price;
	private String Bookname;
	
	public Libaray(int bookId, int price, String bookname) {
		super();
		BookId = bookId;
		this.price = price;
		Bookname = bookname;
	}
	
	public int getBookId() {
		return BookId;
	}
	
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBookname() {
		return Bookname;
	}
	
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	
	
	

}
