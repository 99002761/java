package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bookapp.model.Book;
@Service
public class BookDAOImpl implements BookDAO {

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return showBookList();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		List<Book> newBookList = new ArrayList<>();
		for(Book book: showBookList()) {
			if(book.getAuthor().equals(author))
				newBookList.add(book);
		}
		// TODO Auto-generated method stub
		return newBookList;
				
	}

	@Override
	public List<Book> getByCategory(String category) {
		List<Book> newBookList = new ArrayList<>();
		for(Book book: showBookList()) {
			if(book.getCategory().equals(category))
				newBookList.add(book);
		}
		return newBookList;
		
	}

	@Override
	public Book getById(int id) {
		for(Book book : showBookList()) {
			if(book.getBookId()==id)
				return book;
		}
		return null;
		
		// TODO Auto-generated method stub
	}
	
	private List<Book> showBookList(){
		return Arrays.asList(
				new Book(1,"learn java","shravani","tech",100.0),
				new Book(1,"core java","ruchi,","hitech",500.0),
				new Book(1,"novels","kalyan","tech",1000.0)
				);
	}

}
