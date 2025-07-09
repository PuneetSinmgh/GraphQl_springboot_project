package com.springboot.graphql.component;

import com.springboot.graphql.model.Author;
import com.springboot.graphql.model.Book;
import com.springboot.graphql.repository.AuthorRepository;
import com.springboot.graphql.repository.BookRepository;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final AuthorRepository authorRepository;

    private final BookRepository bookRepository;

    public DataLoader(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        authorRepository.save( new Author("John Bill"));
        authorRepository.save( new Author("Rayan Gosling"));
        authorRepository.save( new Author("Ketan Bhagat"));
        authorRepository.save( new Author("Amitabh Bachan"));

        bookRepository.saveAll(List.of(
                new Book("Tale of two cities", 200, "John Bill","Jacksons"),
                new Book("Tale of two cities", 200, "Rayan Gosling","Jacksons"),
                new Book("Tale of two cities", 200, "Ketan Bhagat","Jacksons"),
                new Book("Tale of two cities", 200, "Amitabh Bachchan","Jacksons")
        ));
    }
}
