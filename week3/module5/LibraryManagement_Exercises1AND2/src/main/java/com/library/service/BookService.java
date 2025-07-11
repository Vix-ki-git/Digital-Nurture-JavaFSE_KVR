package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	private BookRepository br;
	
	public void setBookRepository(BookRepository br2) {
		this.br = br2;
	}
	
	public void printBooks() {
		System.out.println("Hello welcome to book service class");
		System.out.println("Here is book repo bean: "+br);
	}

}
