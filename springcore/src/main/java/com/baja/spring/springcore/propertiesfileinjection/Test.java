package com.baja.spring.springcore.propertiesfileinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
	
	public static void main(String args[])
	{
		ApplicationContext apx = new ClassPathXmlApplicationContext("com/baja/spring/springcore/propertiesfileinjection/config.xml");
		WebServices webServices = (WebServices) apx.getBean("web");
		System.out.println(webServices);
	}
	
}
