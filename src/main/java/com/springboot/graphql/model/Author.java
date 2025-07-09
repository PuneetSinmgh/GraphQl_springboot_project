package com.springboot.graphql.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Author {

    private String name;
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany
    private List<Book> books;

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

}
