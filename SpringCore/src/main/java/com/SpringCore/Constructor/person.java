package com.SpringCore.Constructor;

import java.util.List;

public class person {

	private String Name;
	private String Address;
	private Certi certi;  //object
	private List<String> list;
	
	public person(String name, String address,Certi certi,List<String> list) {
		this.Name = name;
		this.Address = address;
		this.certi=certi;
		this.list=list;
	}
	
	





	@Override
	public String toString() {
		return this.Name+" : "+this.Address+"{"+this.certi.Name+"}: "+this.list+" ";
	}
	
	
	
	
	
	
	
}
