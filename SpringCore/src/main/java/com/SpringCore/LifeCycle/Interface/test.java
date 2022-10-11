package com.SpringCore.LifeCycle.Interface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    AbstractApplicationContext context= new ClassPathXmlApplicationContext("LifeCycle.xml");
	    girl g=(girl) context.getBean("g");
	    context.registerShutdownHook();
	    System.out.println(g);

	}

}
