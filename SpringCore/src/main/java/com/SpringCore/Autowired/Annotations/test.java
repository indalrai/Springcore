package com.SpringCore.Autowired.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context	=new ClassPathXmlApplicationContext("AutowiredAnnotation.xml");
	Emp emp1=context.getBean("emp1",Emp.class);
	System.out.println(emp1);

	}

}
