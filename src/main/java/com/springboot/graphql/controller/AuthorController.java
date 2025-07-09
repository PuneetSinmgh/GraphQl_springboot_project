package com.springboot.graphql.controller;

import com.springboot.graphql.model.Author;
import com.springboot.graphql.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {

    @Autowired
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @QueryMapping
    public Iterable<Author> authors(){
        return authorRepository.findAll();
    }

}
