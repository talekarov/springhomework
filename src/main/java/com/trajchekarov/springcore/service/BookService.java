package com.trajchekarov.springcore.service;

import com.trajchekarov.springcore.model.Author;
import com.trajchekarov.springcore.model.Book;
import com.trajchekarov.springcore.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository=bookRepository;
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public List<Book> getByAuthor(String name) {
        List<Book> books = bookRepository.findAll();
        return books.stream().filter(book -> book.getAuthor().getName().equals(name)).collect(Collectors.toList());
    }
}
