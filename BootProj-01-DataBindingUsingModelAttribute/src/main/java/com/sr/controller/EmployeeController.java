package com.sr.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sr.model.Employee;

@Controller
public class EmployeeController {
	@GetMapping("/")
	public String welcomePage() {
		return "welcome";
	}

	@GetMapping("/register")
	public String register() {
		return "registration_form";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute("emp") Employee emp,@RequestParam int id) {
		System.out.println(id);
		return "display_emp";
	} 
}
