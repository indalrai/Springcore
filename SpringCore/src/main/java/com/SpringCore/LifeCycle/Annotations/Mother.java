package com.SpringCore.LifeCycle.Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mother {
	
	private double Sareeprice;

	public double getSareeprice() {
		return Sareeprice;
	}

	public void setSareeprice(double sareeprice) {
		Sareeprice = sareeprice;
	}

	public Mother() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mother [Sareeprice=" + Sareeprice + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending Method");
	}
	
	

}
