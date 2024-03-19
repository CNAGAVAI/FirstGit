package com.libaraymodel;

public class LibarayDTO {
 String Bookname;
 String AuthorName;
 int Price;
public LibarayDTO(String bookname, String authorName, int price) {
	super();
	Bookname = bookname;
	AuthorName = authorName;
	this.Price = price;
}
public String getBookname() {
	return Bookname;
}
public void setBookname(String bookname) {
	Bookname = bookname;
}
public String getAuthorName() {
	return AuthorName;
}
public void setAuthorName(String authorName) {
	AuthorName = authorName;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	this.Price = price;
}
 
public String toString() {
	return "LibarayDTO [name=" + Bookname + "AuthorName:"+ AuthorName+", price=" + Price + "]";
	}
}
