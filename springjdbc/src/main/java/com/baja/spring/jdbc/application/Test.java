package com.baja.spring.jdbc.application;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext cpx = new ClassPathXmlApplicationContext("com/baja/spring/jdbc/application/config.xml");
		daoEmployeeImpl dao = (daoEmployeeImpl) cpx.getBean("daoimpl");
//		Employee e = new Employee();
//		e.setDesignation("gandu");
//		e.setEmployeeId(9);
//		e.setEmployeeName("loduram");
//		e.setPassword("bc");
//		int result = dao.create(e);
//		System.out.println(result);
//		e = dao.read(1);
//		System.out.println(e.getTime());
		
		List<Employee> list = dao.completeData();
		for (Employee employee : list) {
			System.out.println(employee.getEmployeeName());
		}
		
		}
}
