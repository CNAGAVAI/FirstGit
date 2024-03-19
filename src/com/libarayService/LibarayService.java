package com.libarayService;
import java.util.*;

import com.libaraymodel.Libaray;

public interface LibarayService {
	
	List<Libaray> getAllBooks();
	
	public Libaray getBook(int BookId);

	public void updatebook(Libaray b);

	public  void addbook(Libaray b) ;
	
	public void deletebook(int BookId);

}
