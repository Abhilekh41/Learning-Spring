package com.baja.spring.springcore.standalonelist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext apx = new ClassPathXmlApplicationContext("com/baja/spring/springcore/standalonelist/config.xml");
		ProductList pl =(ProductList) apx.getBean("products");
		System.out.println(pl.getProductNames());
	}
}
