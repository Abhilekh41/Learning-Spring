package com.baja.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDAOImpl emplyoeeDAOImpl;
	
	@RequestMapping("/registration")
	public ModelAndView employeeRegistration()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("employee");
		return mav;
	}
	
	@RequestMapping(value="/registerUser", method=RequestMethod.POST)
	public ModelAndView employeeRegistration(@ModelAttribute ("employee")Employee employee)
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("employee", employee);
		mav.setViewName("registrationDone");
		return mav;
	}

}
