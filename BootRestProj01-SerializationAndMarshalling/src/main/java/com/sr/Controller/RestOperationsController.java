package com.sr.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sr.model.Company;
import com.sr.model.Employee;
import com.sr.model.Project;

@RestController
@RequestMapping("/cont")
public class RestOperationsController {

	@PostMapping("/serialize")
	public ResponseEntity<Company> getSerialized(){
		Company company=new Company(111, "C-DAC", new Project(22, "Esign", 1000000, new Employee(3, "Aditya", "Selu", 52000)));
		return new ResponseEntity<Company>(company,HttpStatus.OK);
	}
}
