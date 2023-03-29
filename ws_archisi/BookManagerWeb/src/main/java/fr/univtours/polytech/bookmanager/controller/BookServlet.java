package fr.univtours.polytech.bookmanager.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.univtours.polytech.bookmanager.business.BooksBusinessLocal;
import fr.univtours.polytech.bookmanager.model.BookBean;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet(name = "BookServlet", urlPatterns = { "/book-manager" })
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private BooksBusinessLocal booksBusinessLocal;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupère les notes en base.
	    List<BookBean> books = this.booksBusinessLocal.getBooksList();
	    request.setAttribute("BOOKS_LIST", books);

	    RequestDispatcher dispatcher = request.getRequestDispatcher("book-manager.jsp");
	    dispatcher.forward(request, response);
	}
}
