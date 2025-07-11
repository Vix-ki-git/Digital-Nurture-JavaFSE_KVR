
package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;
import com.library.repository.BookRepository;

public class Main {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		BookRepository br = (BookRepository) context.getBean("bookRepository");
		
		BookService bs = (BookService) context.getBean("bookService", br);
		
		System.out.println(bs+"Hello testing output "+br);
		
		bs.printBooks();
		
	}

}
