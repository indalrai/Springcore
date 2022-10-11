package com.SpringCore.Standalone.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("Standalone.xml");
		person p=con.getBean("person1",person.class);
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(p.getFeeStructure());
		System.out.println(p.getFeeStructure().getClass().getName());
		System.out.println("---------------------------------------------------------------------------------");
        System.out.println(p.getProperties());
        System.out.println(p.getProperties().getClass().getName());
	}

}
