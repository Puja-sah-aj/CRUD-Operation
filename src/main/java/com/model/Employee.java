package com.model;

public class Employee {
	private int id;
	private String name;
	private String speciality;
	private String email;
	private String city;
	private String country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Employee(int id, String name, String speciality, String email, String city, String country) {
		super();
		this.id = id;
		this.name = name;
		this.speciality = speciality;
		this.email = email;
		this.city = city;
		this.country = country;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
