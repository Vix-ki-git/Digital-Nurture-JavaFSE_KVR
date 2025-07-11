package com.library.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.BookSample;
import com.library.repository.BookRepository;


@Service
public class BookService {
	private BookRepository br;
	private BookSample bs1;
	@Autowired
	public BookService(BookSample bs2) {
		this.bs1 = bs2;
		System.out.println("Constructor Injection done");
	}
	
	@Autowired
	public void setBookRepository(BookRepository br2) {
		this.br = br2;
		System.out.println("Setter Injection done");
	}
	
	public void showBooks() {
		System.out.println("This is a function in BookService class and here is the injected BookRepository: "+br);
	}

}
