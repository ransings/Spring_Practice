package com.sr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.sr.dao.StudentDao;
import com.sr.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao dao;
	
	public String saveStudent(Student std)throws Exception{
		std=dao.save(std);
		return std.toString()+" is Saved Successfully";
	}

	
	public List<Student> getAllStudents()throws Exception{
		List<Student> students=dao.findAll();
		return students;
	}
	
}
