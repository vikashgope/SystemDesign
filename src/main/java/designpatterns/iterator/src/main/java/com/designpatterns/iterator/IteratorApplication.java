package com.designpatterns.iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IteratorApplication {

    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        collection.addBook(new Book("Clean Code", "Robert Martin"));
        collection.addBook(new Book("Effective Java", "Joshua Bloch"));
        collection.addBook(new Book("Design Patterns", "Gang of Four"));

        Iterator iterator = collection.createIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
    }


