package com.SpringCore.LifeCycle.Annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycle.xml");
		context.registerShutdownHook();
		Mother m = (Mother) context.getBean("m");
		System.out.println(m);

	}

}
