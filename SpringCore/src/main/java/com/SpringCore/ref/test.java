package com.SpringCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
	ApplicationContext context=new ClassPathXmlApplicationContext("ref.xml");
	College clg=(College) context.getBean("clg");
	System.out.println(clg.getRollno());
	
	System.out.println(clg.getObj().getSeries());
	
	System.out.println(clg);
	

	}

}
