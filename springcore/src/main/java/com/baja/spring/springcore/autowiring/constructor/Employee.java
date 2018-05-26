package com.baja.spring.springcore.autowiring.constructor;

/**
 * Hello world!
 *
 */
public class Employee {

	Employee(Address address)
	{
		this.address=address;
	}
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public void setAddress(Address address) {
		this.address = address;
	}


}
