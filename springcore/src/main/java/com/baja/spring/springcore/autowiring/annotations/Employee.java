package com.baja.spring.springcore.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Hello world!
 *
 */
public class Employee {
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

}
