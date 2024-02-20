package com.sbj.aaa;

class BookClass {
    private String title;
    private String author;
    private int price;
    private String publisher;
    private final float tax = 1.1f; // tax 필드를 1.1f로 고정
    private int size;

    public BookClass(String title, String author, int price, String publisher, int tax, int size) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }
    
    public int getSize() {
    	return size;
    }

    @Override
    public String toString() {
        return "제목: " + title + ", 저자: " + author + ", 가격: " + price + "원";
    }
}