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
        System.out.println(".................. 전체 도서 목록 ..................");
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            } else {
                System.out.println("등록된 도서가 없습니다.");
            }
        }
    }

    // 메시지 출력
    public void displayMessage(String message) {
        System.out.println(message);
    }

}
