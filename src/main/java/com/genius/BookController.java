package com.genius;

import java.util.List;

public class BookController {

    Library library =  new Library();
    BookView view = new BookView();

    public void addBook(String title, String author, int isbn, boolean isForeignBook) {
        Book book = new Book(title, author, isbn, isForeignBook);
        library.addBook(book);
        view.displayMessage("도서가 성공적으로 추가되었습니다.");
    }

    public void getBook(int isbn) {
        Book book = library.getBook(isbn);

        if (book != null) {
            view.displayBook(book);
            view.displayMessage(isbn + "번 도서를 찾았습니다.");
        } else {
            System.out.println("해당 도서를 찾을 수 없습니다.");
        }
    }

    public void getAllBooks() {
        List<Book> books = library.getAllBooks();

        if (books.isEmpty()) {
            view.displayMessage("등록된 도서가 없습니다.");
        } else {
            view.displayBookList(books);
            view.displayMessage("전체 도서가 조회 되었습니다.");
        }
    }

    public void updateBook(int isbn, String title, String author) {
        Book book = library.getBook(isbn);

        if (book != null) {
            library.updateBook(isbn, title, author);
            view.displayMessage("도서 정보가 성공적으로 수정되었습니다.");
        } else {
            System.out.println("해당 도서를 찾을 수 없습니다.");
        }
    }

    public void deleteBook(int isbn) {
        Book book = library.getBook(isbn);

        if (book != null) {
            library.deleteBook(isbn);
            view.displayMessage("도서가 성공적으로 삭제되었습니다.");
        } else {
            System.out.println("해당 도서를 찾을 수 없습니다.");
        }
    }

}
