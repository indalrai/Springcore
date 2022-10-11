package com.SpringCore.ref;

public class College {

	private int Rollno;
	private School obj;

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public School getObj() {
		return obj;
	}

	public void setObj(School obj) {
		this.obj = obj;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "College [Rollno=" + Rollno + ", obj=" + obj + "]";
	}

}
