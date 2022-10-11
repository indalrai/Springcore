package com.SpringgCore.Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employees {

	private String name;
	private List<String> PhoneNmbers;
	private Set<String> Address;
	private Map<String,String> Courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public List<String> getPhoneNmbers() {
		return PhoneNmbers;
	}
	public void setPhoneNmbers(List<String> phoneNmbers) {
		PhoneNmbers = phoneNmbers;
	}
	public Set<String> getAddress() {
		return Address;
	}
	public void setAddress(Set<String> address) {
		Address = address;
	}
	public Map<String, String> getCourses() {
		return Courses;
	}
	public void setCourses(Map<String, String> courses) {
		Courses = courses;
	}
	public Employees(String name, List<String> phoneNmbers, Set<String> address, Map<String, String> courses) {
		super();
		name = name;
		PhoneNmbers = phoneNmbers;
		Address = address;
		Courses = courses;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
