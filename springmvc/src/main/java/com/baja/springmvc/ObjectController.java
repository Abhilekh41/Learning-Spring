package com.baja.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ObjectController {
		@RequestMapping("/object")
		public ModelAndView sendObject()
		{
			ModelAndView mav = new ModelAndView();
			mav.setViewName("object");
			Employee employee = new Employee();
			employee.setEmployeeId(1);
			employee.setDesignation("chodu");
			employee.setEmployeeName("Abhi");
			employee.setPassword("ghanta");
			mav.addObject("objectEmployee",employee);
			return mav;
		}
}
