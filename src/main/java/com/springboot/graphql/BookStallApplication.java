package com.springboot.graphql;

import com.springboot.graphql.model.Author;
import com.springboot.graphql.model.Book;
import com.springboot.graphql.repository.AuthorRepository;
import com.springboot.graphql.repository.BookRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BookStallApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStallApplication.class, args);
    }

//    @Bean
/*    ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository){

        return args -> {
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
        };
    }
    */

}
