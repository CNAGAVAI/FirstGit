package com.LibarayDao;

import java.util.ArrayList;
import java.util.List;

import com.libaraymodel.Libaray;


public class LibarayDaoImpl implements LibarayDao {
	
	private static final String b = null;
	List<Libaray> books;
	
	public LibarayDaoImpl() {
		books = new ArrayList<Libaray>();
	      Libaray book1 = new Libaray(1,200,"Robotics");
	      Libaray book2 = new Libaray(2,500,"DataStructures");
	      books.add(book1);
	      books.add(book2);  
	       		
	   }

	@Override
	public Libaray getBook(int BookId) {
		// TODO Auto-generated method stub
		return books.get(BookId);
	}

	@Override
	public void updatebook(Libaray b) {
		// TODO Auto-generated method stub
		
	      books.get(b.getBookId()).setBookname(b.getBookname());
	     
	
	      System.out.println("BookId " + b.getBookId() + ", updated with book name "+b.getBookname()+" price: "+b.getPrice()+" in the database");
		
	}

	@Override
	public void addbook(Libaray b) {
		// TODO Auto-generated method stub
		books.add(b);
		
	}

	@Override
	public void deletebook(int BookId) {
		// TODO Auto-generated method stub
		books.remove(BookId);
	
	}



	@Override
	public List<Libaray> getAllBooks() {
		// TODO Auto-generated method stub
		return books;
	}
	

}
