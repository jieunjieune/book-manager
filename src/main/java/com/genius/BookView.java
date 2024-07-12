package com.genius;

import java.util.List;

public class BookView {

    private Library library;

    public void BookController(Library library) {
        this.library = library;
    }

    // 도서 정보 출력
    public void displayBook(Book book) {
        System.out.println(book);
    }

    // 도서 목록 출력
    public void displayBookList(List<Book> books) {
        System.out.println("...............( 전체 도서 목록 ).................");
        for (Book book : books) {
                System.out.println(book);
        }
    }

    // 메시지 출력
    public void displayMessage(String message) {
        System.out.println(message);
    }

}
