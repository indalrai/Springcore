package com.SpringCore.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("stereo.xml");
		Student student = context.getBean("obj", Student.class);
		/*
		 * System.out.println(student); System.out.println(
		 * "------------------------------------------------------------");
		 * System.out.println(student.getAddress());
		 * System.out.println(student.getAddress().getClass().getName());
		 */

		System.out.println(student.hashCode());
		
		Student student2=context.getBean("obj",Student.class);
		System.out.println(student2.hashCode());
		
	}
}
