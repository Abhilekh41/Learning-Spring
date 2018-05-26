package com.baja.spring.advanced.injectinginterfaces;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createDAO() {
		System.out.println("Inside Order DAO");
		
	}
	
}	
