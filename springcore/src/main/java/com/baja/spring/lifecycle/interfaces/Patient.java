package com.baja.spring.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{
	
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
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		  System.out.println("inside afterPropertiesSet");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside Destroy Method");
	}
	
}
