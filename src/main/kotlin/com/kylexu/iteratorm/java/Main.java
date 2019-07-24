package com.kylexu.iteratorm.java;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book("Around the world in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("The java for impatient"));
        bookShelf.appendBook(new Book("Gang of Four"));
        bookShelf.appendBook(new Book("Exception?"));

        IteratorGOF iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
