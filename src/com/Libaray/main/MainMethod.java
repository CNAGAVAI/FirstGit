package com.Libaray.main;
import java.util.*;


import com.libarayService.LibarayService;
import com.libarayService.LibarayServiceImpl;
import com.libaraymodel.BookAuthor;
import com.libaraymodel.Libaray;
import com.libaraymodel.LibarayDTO;



public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibarayService libser=new LibarayServiceImpl();
		
		List<Libaray> list=libser.getAllBooks();
	    for (Libaray lib : list) {
	       System.out.println("Libaray: [Id : " + lib.getBookId() + ", Name : " +lib.getBookname() + " ,PRICE: " +lib.getPrice()+" ]");
	    }
	   Libaray bookses =libser.getAllBooks().get(0);
	   
	   bookses.setBookname("selenium");
	    libser.updatebook(bookses);

	   Libaray s1=new Libaray(3,300,"comics");
	    libser.addbook(s1);
	    System.out.println("After calling add");
	    for (Libaray std :libser.getAllBooks()) {
		       System.out.println("Libaray: [BookId : " + std.getBookId() + ", Name : " + std.getBookname() +",Price:"+std.getPrice()+"]");
		   }
	
	    int BookId=1;
	    libser.deletebook(BookId);
	    System.out.println("After delete");
	    List<Libaray> libList=libser.getAllBooks();
	    for (Libaray std : libList) {
		       System.out.println("Libaray: [BookId : " + std.getBookId() + ", Name : " + std.getBookname()+ " ,Price :" + std.getPrice() +"]");
		   }
	    
	    
	    BookAuthor author1=new BookAuthor("vaishnavi");
	    BookAuthor author2=new BookAuthor("Satish");
	   
	    
	    List<BookAuthor>names=new ArrayList<BookAuthor>();
	    names.add(author1);
	    names.add(author2);
	    
	    
	    List<LibarayDTO>authlist=new ArrayList<LibarayDTO>();
	    authlist.add(new LibarayDTO(libList.get(0).getBookname(),names.get(0).getAuthorName(),libList.get(0).getPrice()));
	    authlist.add(new LibarayDTO(libList.get(1).getBookname(),names.get(1).getAuthorName(),libList.get(1).getPrice()));
	   
	   
	    
 for(LibarayDTO dtodata:authlist) {
	System.out.println(dtodata.getBookname() + " "+dtodata.getAuthorName()+" "+dtodata.getPrice());
		   }
		    
}
	

}
