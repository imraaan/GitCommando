package com.sd.java.training;

import java.io.Serializable;

public class Person implements Serializable {
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
	private String name;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	private String address;
	private int number;
}
