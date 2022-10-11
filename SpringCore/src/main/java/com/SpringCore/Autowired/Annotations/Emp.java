package com.SpringCore.Autowired.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	@Autowired
	@Qualifier("address3")

	private Address address;

	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting values");
	}

	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("setting constructors");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub

	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
