package com.baja.spring.springhibernate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext cpx = new ClassPathXmlApplicationContext("com/baja/spring/springhibernate/config.xml");
		daoEmployeeImpl dao = (daoEmployeeImpl) cpx.getBean("daoEmployeeImpl");
		Employee e = new Employee();
		e.setDesignation("gandu");
		e.setEmployeeId(10);
		e.setEmployeeName("ganduram");
		e.setPassword("bc");
		//int result = dao.create(e);
//		Employee employee = dao.read(3);
//		System.out.println(employee.getDesignation());
		List<Employee> list = new ArrayList<Employee>();
		list = dao.completeData();
		for (Employee employee : list) {
			System.out.println(employee.getDesignation());
		}
//		List<Employee> list = dao.completeData();
//		for (Employee employee : list) {
//			System.out.println(employee.getEmployeeName());
//		}
		
		}
}
