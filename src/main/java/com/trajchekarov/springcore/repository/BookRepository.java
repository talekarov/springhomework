package com.trajchekarov.springcore.repository;

import com.trajchekarov.springcore.model.Author;
import com.trajchekarov.springcore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

}
