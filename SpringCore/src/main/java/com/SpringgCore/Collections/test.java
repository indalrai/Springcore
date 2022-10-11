package com.SpringgCore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("cconfig.xml");
		Employees Emp = (Employees) context.getBean("Emp");
		System.out.println(Emp.getName());
		System.out.println(Emp.getPhoneNmbers());
		System.out.println(Emp.getAddress());
		System.out.println(Emp.getCourses());
	}

}
