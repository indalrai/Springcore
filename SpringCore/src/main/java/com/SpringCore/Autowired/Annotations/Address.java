package com.SpringCore.Autowired.Annotations;

public class Address {
	private String Street;
	private String Cities;

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCities() {
		return Cities;
	}

	public void setCities(String cities) {
		Cities = cities;
	}

	@Override
	public String toString() {
		return "Address [Street=" + Street + ", Cities=" + Cities + "]";
	}

}
