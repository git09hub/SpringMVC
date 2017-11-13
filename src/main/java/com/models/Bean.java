package com.models;

public class Bean {
	
	private int id;
	
	private String FirstName;
	
	private String LastName;
	
	private String City;
	
	private String Pin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getPin() {
		return Pin;
	}

	public void setPin(String pin) {
		Pin = pin;
	}

	@Override
	public String toString() {
		return "Bean [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", City=" + City + ", Pin="
				+ Pin + "]";
	}
	
}
