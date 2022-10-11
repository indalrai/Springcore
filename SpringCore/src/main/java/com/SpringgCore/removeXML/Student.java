package com.SpringgCore.removeXML;

import org.springframework.stereotype.Component;

public class Student {

	private Boy boy;

	public Boy getBoy() {
		return boy;
	}

	public Student(Boy boy) {
		super();
		this.boy = boy;
	
	}

	public void setBoy(Boy boy) {
		this.boy = boy;
	}

	public void Study() {
		this.boy.Display();
		System.out.println("Reading Books");
	}

}
