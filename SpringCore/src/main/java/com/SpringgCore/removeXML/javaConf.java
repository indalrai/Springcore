package com.SpringgCore.removeXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConf {

	@Bean
	public Boy getboy() {
		return new Boy();
	}

	@Bean
	public Student getStudent() {

		// creating a new object
		Student student = new Student(getboy());
		return student;
	}

}
