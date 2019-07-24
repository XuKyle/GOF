package com.kylexu.iteratorm.java;

public class BookShelfIteratorGOF implements IteratorGOF {
    private BookShelf bookShelf;
    private int index;

    BookShelfIteratorGOF(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
