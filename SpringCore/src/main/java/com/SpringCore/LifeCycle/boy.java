package com.SpringCore.LifeCycle;

public class boy {

	private Double Bookprice;

	public Double getBookprice() {
		return Bookprice;
	}

	public void setBookprice(Double bookprice) {
		System.out.println("Setting properties");
		Bookprice = bookprice;
	}

	public boy() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "boy [Bookprice=" + Bookprice + "]";
	}

	public void init() {
		System.out.println("Inside init method");
	}

	public void destroy() {
		System.out.println("Inside destro method");
	}

}
