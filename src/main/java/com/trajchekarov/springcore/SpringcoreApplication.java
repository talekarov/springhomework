package com.trajchekarov.springcore;


import com.trajchekarov.springcore.service.AuthorService;
import com.trajchekarov.springcore.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringcoreApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}

	BookService bookService = SpringContext.getBean(BookService.class);
	AuthorService authorService = SpringContext.getBean(AuthorService.class);


}
