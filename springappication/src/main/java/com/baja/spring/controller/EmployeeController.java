package com.baja.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.baja.spring.bean.Employee;
import com.baja.spring.dao.EmployeeDAO;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDAO employeeDAO;
	
	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@RequestMapping("/registration")
	public String create()
	{
	return "registeruser";
	}
	
	@RequestMapping(value = "/registerUser", method= RequestMethod.POST)
	public String userCreation(@ModelAttribute("employee") Employee employee, ModelMap model)
	{
		System.out.println("3");
		int result = employeeDAO.create(employee);
		System.out.println("5");
		
		model.addAttribute("result","user created"+result);
		return "registeruser";
	}
}
