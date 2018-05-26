package com.baja.spring.lifecycle.xmlconfig;

public class Patient{
	
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		
		System.out.println("Inside the getter method");
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void hi()
	{
		System.out.println("Hi");
	}
	public void bye()
	{
		System.out.println("Bye");
	}
	
}
