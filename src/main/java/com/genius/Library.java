package com.genius;

import java.util.ArrayList;
import java.util.List;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBook(int isbn) {
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                return book;
            }
        } return null;
    }

    public void updateBook(int isbn, String title, String author) {
        Book book = getBook(isbn);
        book.setTitle(title);
        book.setAuthor(author);
    }

    public void deleteBook(int isbn) {
        Book book = getBook(isbn);
        books.remove(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
