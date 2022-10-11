package com.SpringCore.SpringCore;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Student stu = (Student) context.getBean("stu");
		Student stu1 = (Student) context.getBean("stu1");
		Student stu2 = (Student) context.getBean("stu2");

		System.out.println(stu);
		System.out.println(stu1);
		System.out.println(stu2);
	}
}
