package com.springboot.graphql.model;

import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Author {

    private String name;
    @Id
    @GeneratedValue
    private Long id;
    private List<Book> books;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
