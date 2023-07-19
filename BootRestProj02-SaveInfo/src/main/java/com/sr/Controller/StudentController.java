package com.sr.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sr.model.Student;
import com.sr.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping("/add")
	public ResponseEntity<String> saveStudent(@RequestBody Student std){
		String str;
		try {
			str=service.saveStudent(std);
		}
		catch (Exception e) {
			str="Exception "+e.getMessage()+" Occured";
		}
		return new ResponseEntity<String>(str,HttpStatus.CREATED);
	}
	
	@GetMapping("/report")
	public ResponseEntity<List<Student>> getEmps()throws Exception{
		List<Student> stds=service.getAllStudents();
		return new ResponseEntity<List<Student>>(stds,HttpStatus.OK);
	}

}
