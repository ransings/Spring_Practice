package com.sr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {

	@RequestMapping("/home")
	public String test() {
		return "home";
	}
	
	
}
