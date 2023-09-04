package com.singleton;

public class Customer {
	private int id; 
	private String name; 
	private String city; 
	private String pan; 
	private String contact;
	
	public Customer() {
		 
	}

	public Customer(int id, String name, String city, String pan, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.pan = pan;
		this.contact = contact;
	}

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", pan=" + pan + ", contact=" + contact
				+ "]";
	} 
	
	
}
