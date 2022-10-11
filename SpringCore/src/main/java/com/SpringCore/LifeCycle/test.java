package com.SpringCore.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Lifecycle.xml");
		boy b = (boy) context.getBean("b");
		System.out.println(b);
		
		context.registerShutdownHook(); 
		
		

	}

}
