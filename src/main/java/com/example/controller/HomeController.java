package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("index")
public class HomeController {
	
	@RequestMapping(value = "index",method= RequestMethod.GET)
	public String index(ModelMap modelMap) {
		//modelMap.put("a", 123);
		return "webapp/WEB-INF/rvfilm/index.html";
	}	
	@RequestMapping(value = "HOT", method= RequestMethod.GET)
	public String HOT(ModelMap modelMap) {
		modelMap.put("DM","HOT");
		return "webapp/WEB-INF/rvfilm/reviews.html";
	}
	@RequestMapping(value = "NEW", method= RequestMethod.GET)
	public String NEW(ModelMap modelMap) {
		modelMap.put("DM", "NEW");
		return "webapp/WEB-INF/rvfilm/reviews.html";
	}
	
}
