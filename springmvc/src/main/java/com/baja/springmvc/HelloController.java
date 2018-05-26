			package com.baja.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		mav.addObject("id",123);
		mav.addObject("name","baja");
		mav.addObject("salary",20000);
		return mav;
	}
}
