package com.SpringCore.Spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    
	@Value("#{22+11}")
	private int x;
	
	@Value("#{33+11}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	@Value("#{T(java.lang.Math).E}")
	private double E;
	
	@Value("#{new java.lang.String('Indal')}")
	private String name;
	
	@Value("#{8>3}")
	private boolean inActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	

	public double getE() {
		return E;
	}

	public void setE(double e) {
		E = e;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", E=" + E + ", name=" + name + ", inActive=" + inActive
				+ "]";
	}

}
