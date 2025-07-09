package com.springboot.graphql.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private int price;
    private String author;
    private String publisher;

    public Book() {
    }

    public Book(String title, int price, String author, String publisher) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }

}
