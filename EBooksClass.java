package com.sbj.aaa;

class EBookClass extends BookClass {
	private String supperDevices;
    private String deviceInfo;

    public EBookClass(String title, String author, int price, String publisher, String supperDevices, String deviceInfo) {
        super(title, author, price, publisher, price, price);
        this.supperDevices = supperDevices;
        this.deviceInfo = deviceInfo;
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