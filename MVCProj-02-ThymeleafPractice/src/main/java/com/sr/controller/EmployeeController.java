package com.sr.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sr.entity.Employee;
import com.sr.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/show_emp")
	public String getAllEmps(Map<String, Object> map) {
		List<Employee> emps=service.getAllEmps();
		map.put("emps", emps);
		return "show_emp";
	}

}
