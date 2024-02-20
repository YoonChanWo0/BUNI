package com.sbj.aaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMain {

    static List<BookClass> bookList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // 엔터치기전까지의 모든 문자값을 리턴
            switch (choice) {
                case 1:
                    registerBook();
                    break;
                case 2:
                    searchBook();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    displayBooks();
                    break;
                case 5:
                    purchaseBook();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("**** 메뉴 ****");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 삭제");
        System.out.println("4. 도서 확인");
        System.out.println("5. 도서 구입");
        System.out.println("6. 종료");
        System.out.print("메뉴를 선택하세요: ");
    }

    private static void registerBook() {
        System.out.println("도서 등록을 선택하셨습니다.");
        System.out.println("어떤 종류의 책을 등록하시겠습니까? (1. 전자책 / 2. 일반책)");
        int bookTypeChoice = scanner.nextInt();
        scanner.nextLine(); // 엔터 치기 전까지 모든 문자열을 리턴

        System.out.print("책 제목: ");
        String title = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();
        System.out.print("가격: ");
        int price = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("출판사: ");
        String publisher = scanner.nextLine();
        System.out.println("책 페이지");
        int size = scanner.nextInt();
        System.out.println("호환하시겠습니까? 하시려면 1번, 아니면 2번, 일반책으로 등록하시려면 3번");
        int bookTc = scanner.nextInt();
        if (bookTc == 1) {
        	System.out.println("호환하시겠습니까? 하시려면 1번, 아니면 2번");
            bookList.add(new BookClass(title, author, price, publisher, price, size));
            System.out.println("호환되었습니다. 도서 등록이 완료 되었습니다.");
        } else if (bookTc == 2) {
            System.out.print("호환되지 않았습니다.): ");
            String supperDevices = scanner.nextLine();
            System.out.print("디바이스 정보: ");
            String deviceInfo = scanner.nextLine();
            bookList.add(new EBookClass(title, author, price, publisher, supperDevices, deviceInfo));
            System.out.println("전자책이 등록되었습니다.");
        } else if(bookTc == 3){
            System.out.println("일반책으로 등록되었습니다.");
        } else {
        	System.out.println("잘못된 선택입니다. 도서 등록을 취소합니다.");        	
        }
    }

    private static void searchBook() {
        System.out.println("도서 검색을 선택하셨습니다.");
        System.out.print("검색할 책 제목: ");
        String searchTitle = scanner.nextLine();
        for (BookClass book : bookList) {
            if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println("도서 정보: " + book);
                return;
            }
        }
        System.out.println("검색한 책이 없습니다.");
    }
    
//    private static void searchBook() { // 페이지 넣어서 출력하려니까 오류 발생 원인 모르겠음
//        System.out.println("도서 검색을 선택하셨습니다.");
//        System.out.print("검색할 책 제목: ");
//        String searchTitle = scanner.nextLine();
//        for (BookClass book : bookList) {
//            if (book instanceof PaperBookClass && book.getTitle().equalsIgnoreCase(searchTitle)) {
//                PaperBookClass paperBook = (PaperBookClass) book; // PaperBookClass로 형변환
//                System.out.println("도서 정보: " + book + ", 도서 페이지: " + paperBook.getSize());
//                return;
//            }
//        }
//        System.out.println("검색한 책이 없습니다.");
//    }

    private static void deleteBook() {
        System.out.println("도서 삭제를 선택하셨습니다.");
        System.out.print("삭제할 책 제목: ");
        String deleteTitle = scanner.nextLine();
        for (BookClass book : bookList) {
            if (book.getTitle().equalsIgnoreCase(deleteTitle)) {
                bookList.remove(book);
                System.out.println("도서가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("삭제할 책을 찾을 수 없습니다.");
    }

    private static void displayBooks() {
        System.out.println("도서 확인을 선택하셨습니다.");
        for (BookClass book : bookList) {
            System.out.println(book);
        }
    }

    private static void purchaseBook() {
        System.out.println("도서 구입을 선택하셨습니다.");
        System.out.print("구입할 책 제목: ");
        String purchaseTitle = scanner.nextLine();
        for (BookClass book : bookList) {
            if (book.getTitle().equalsIgnoreCase(purchaseTitle)) {
                System.out.println("책 이름: " + book.getTitle());
                System.out.println("가격(세금 포함): " + (book.getPrice() + book.getTitle()) + "원");
                System.out.println("구입이 완료되었습니다.");
                return;
            }
        }
        System.out.println("구입할 책을 찾을 수 없습니다.");
    }
}