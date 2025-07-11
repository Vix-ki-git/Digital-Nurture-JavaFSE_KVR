package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import com.library.BookSample;
	

public class Main {
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BookService bs = context.getBean(BookService.class);
		
		bs.showBooks();
		
	}

}
