package com.genius;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BookController controller = new BookController();

        while(true) {
            System.out.println("============== 도서 관리 프로그램 ===============");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 조회");
            System.out.println("3. 도서 수정");
            System.out.println("4. 도서 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("===> 원하시는 기능의 번호를 입력해주세요 : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("===> 추가할 도서의 수를 입력해주세요: ");
                    int addNum = sc.nextInt();
                    Book[] books = new Book[addNum];
                    String title;
                    String author;
                    for (int i = 0; i < addNum; i++) {
                        System.out.print("도서명: ");
                        sc.nextLine();
                        title = sc.nextLine();
                        System.out.print("저자: ");
                        author = sc.nextLine();
                        System.out.print("ISBN 등록번호: ");
                        int isbn = sc.nextInt();
                        System.out.print("해외 서적 여부(true/false): ");
                        boolean isForeignBook = sc.nextBoolean();
                        controller.addBook(title, author, isbn, isForeignBook);
                    }
                    break;

                case 2:
                    System.out.println("---------------- 도서 조회 방법 ------------------");
                    System.out.println("1. 도서 목록 전체 조회");
                    System.out.println("2. isbn 번호로 조회");
                    System.out.print("===> 조회 방법 선택 : ");
                    int searchNum = sc.nextInt();

                    switch (searchNum) {
                        case 1:
                            controller.getAllBooks();
                            break;
                        case 2:
                            System.out.print("===> 찾는 도서의 isbn 번호: ");
                            int isbn = sc.nextInt();
                            System.out.println("............ isbn " + isbn +"번 도서의 정보 ............");
                            controller.getBook(isbn);
                            break;
                        default:
                            System.out.println("잘못된 번호를 입력하셨습니다.");
                            break;
                    } break;

                case 3:
                    System.out.print("===> 변경하고자 하는 책의 isbn 번호: ");
                    int isbn = sc.nextInt();
                    sc.nextLine();
                    System.out.print("===> isbn " + isbn + "번의 새로운 도서명: ");
                    title = sc.nextLine();
                    System.out.print("===> isbn " + isbn + "번의 새로운 저자명: ");
                    author = sc.nextLine();
                    controller.updateBook(isbn, title, author);
                    break;

                case 4:
                    System.out.print("===> 삭제하고자 하는 책의 isbn 번호: ");
                    int isbn1 = sc.nextInt();
                    controller.deleteBook(isbn1);
                    break;

                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요.");
                    break;
            }
        }

    }
}
