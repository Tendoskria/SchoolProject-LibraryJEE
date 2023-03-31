package fr.univtours.polytech.bookmanager.business;

import java.util.List;

import javax.ejb.Local;

import fr.univtours.polytech.bookmanager.model.AppUserBean;
import fr.univtours.polytech.bookmanager.model.BookBean;
import fr.univtours.polytech.bookmanager.model.BorrowBean;

@Local
public interface BorrowsBusinessLocal {

	public List<BorrowBean> getBorrowsList();

	public List<BorrowBean> getBorrowsForBook(int bookId);

	public boolean isBookAvailable(BookBean book);
	
	public List<BookBean> getBooksAvailable();
	
	public void insertBorrow(BorrowBean borrow);
}
