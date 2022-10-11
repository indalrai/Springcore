package com.SpringCore.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("constructor.xml");
          person person1=(person) ctx.getBean("person1");
          System.out.println(person1);
          
         Addition Add= (Addition) ctx.getBean("Add");
         Add.dosum();
          
	}

}
