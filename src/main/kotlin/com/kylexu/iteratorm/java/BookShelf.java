package com.kylexu.iteratorm.java;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements AggregateGOF {

    private List<Book> books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new ArrayList<Book>(maxSize);
    }

    Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(last, book);
        last++;
    }

    int getLength() {
        return last;
    }

    public IteratorGOF iterator() {
        return new BookShelfIteratorGOF(this);
    }
}
