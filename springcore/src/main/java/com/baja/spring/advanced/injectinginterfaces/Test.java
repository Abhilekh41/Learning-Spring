package com.baja.spring.advanced.injectinginterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext apx = new ClassPathXmlApplicationContext("com/baja/spring/advanced/injectinginterfaces/config.xml");
		OrderBOImpl orderBOImpl = (OrderBOImpl) apx.getBean("BOImpl");
		orderBOImpl.placeOrder();
	}
}
