package com.kylexu.iteratorm.java;

public class BookShelf implements AggregateGOF {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    int getLength() {
        return last;
    }

    public IteratorGOF iterator() {
        return new BookShelfIteratorGOF(this);
    }
}
