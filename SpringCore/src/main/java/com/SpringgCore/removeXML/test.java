package com.SpringgCore.removeXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new AnnotationConfigApplicationContext(javaConf.class);	
	Student s1=con.getBean("getStudent",Student.class);
	System.out.println(s1);
	s1.Study();
	
	}

}
