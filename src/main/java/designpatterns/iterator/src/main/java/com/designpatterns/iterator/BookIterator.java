package com.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookIterator implements Iterator   {

   private List<Book> books=new ArrayList<>();
   private int position;

   public BookIterator(List<Book> books)
   {
       this.books=books;
   }

    @Override
    public boolean hasNext() {
        if(position<books.size())
            return true;
            else
                return false;

    }
    @Override
    public Book next() {
       return books.get(position++);
    }

}
