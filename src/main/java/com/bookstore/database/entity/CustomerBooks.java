package com.bookstore.database.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CustomerBooks {

    private Customer customer;
    private List<Book> books;

    public CustomerBooks(Customer key, List<Book> value) {
    }
}