package com.baja.spring.advanced.injectinginterfaces;

public class OrderBOImpl implements OrderBO{
	
	private OrderDAOImpl dao;
	
	
	public OrderDAOImpl getDao() {
		return dao;
	}


	public void setDao(OrderDAOImpl dao) {
		this.dao = dao;
	}


	@Override
	public void placeOrder() {
		System.out.println("Inside OrderBO");
		dao.createDAO();
	}

}
