package com.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Aggregate{
    private List<Book> books=new ArrayList<>();
    public void addBook(Book book)
    {
        books.add(book);
    }
    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }

}
