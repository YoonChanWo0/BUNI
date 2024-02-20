package com.sbj.aaa;

public class PaperBookClass extends BookClass{
	private int size;
	private int sizeInfo;
	
	public PaperBookClass(String title, String author, int price, String publisher, int tax, int size) {
		super(title, author, price, publisher, tax, size);
		this.size = size;
		this.sizeInfo = sizeInfo;
	}
	
	@Override
	public int getSize() {
		return super.getSize();
	}
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return super.getAuthor();
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

	@Override
	public String getPublisher() {
		// TODO Auto-generated method stub
		return super.getPublisher();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	 
}
