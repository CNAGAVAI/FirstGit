package com.LibarayDao;

import java.util.List;

import com.libaraymodel.Libaray;

public interface LibarayDao {
	
	List<Libaray> getAllBooks();
	
	public Libaray getBook(int BookId);

	public void updatebook(Libaray b);

	public void addbook(Libaray b);

	public void deletebook(int BookId);

}
