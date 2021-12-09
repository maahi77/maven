package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {
	
	@GetMapping("/hello")
	@ResponseBody
	public ModelAndView sayHello()
	{
		System.out.println("Hii");
		return new ModelAndView("mahi");
	}

}
