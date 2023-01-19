package com.Lab.entity;

public class C_Address {
	private String city;
	private String state;
	private String country;
	public C_Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "C_Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
}
