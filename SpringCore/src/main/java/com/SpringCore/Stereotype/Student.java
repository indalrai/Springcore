package com.SpringCore.Stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
@Scope("prototype")
public class Student {
	
	@Value("Ranjeet,Rohit,Akash")
	private String StudentName;
	@Value("Gorakhpur,Lucknow,Agra")
	private String City;
	
	@Value("#{Myaddress}")
	private List<String> Address;
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
	public List<String> getAddress() {
		return Address;
	}
	public void setAddress(List<String> address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", City=" + City + ", Address=" + Address + "]";
	}
	
	
	

}
