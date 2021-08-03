package com.trajchekarov.springcore.service;

import com.trajchekarov.springcore.model.Author;
import com.trajchekarov.springcore.repository.AuthorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository=authorRepository;
    }

    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }
}
