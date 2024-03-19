package com.libarayService;

import java.util.List;

import com.LibarayDao.LibarayDao;
import com.LibarayDao.LibarayDaoImpl;
import com.libaraymodel.Libaray;


public class LibarayServiceImpl implements LibarayService{
	LibarayDao dao;

    public LibarayServiceImpl(){
  	  dao=new LibarayDaoImpl();
    }

	@Override
	public Libaray getBook(int BookId) {
		// TODO Auto-generated method stub
		return dao.getBook(BookId);
	}

	@Override
	public void updatebook(Libaray b) {
		// TODO Auto-generated method stub
		dao.updatebook(b);
		
	}

	@Override
	public void addbook(Libaray b) {
		// TODO Auto-generated method stub
		dao.addbook(b);
		
	}

	@Override
	public void deletebook(int BookId) {
		// TODO Auto-generated method stub
		dao.deletebook(BookId);
		
	}

	@Override
	public List<Libaray> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

}
