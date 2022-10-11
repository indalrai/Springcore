package com.SpringCore.LifeCycle.Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class girl implements InitializingBean,DisposableBean {

	private double Bookprice;

	public double getBookprice() {
		return Bookprice;
	}

	public void setBookprice(double bookprice) {
		System.out.println("Setting values");
		Bookprice = bookprice;
	}

	public girl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "girl [Bookprice=" + Bookprice + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("takin girl to home:init");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("throw out ;destroy");
		
	}
	
	
}
