package com.sr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sr.dao.EmployeeDao;
import com.sr.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao dao;

	public Employee addEmployee(Employee emp) {
		return dao.save(emp);
	}
	
	public List<Employee> getAllEmps(){
		return dao.findAll();
	}
	
	public List<Employee> getEmpNameStartsWith(String name){
		return dao.findByNameStartingWith(name);
	}
	
	public List<Employee> getEmpByName(String name) {
		return dao.findByName(name);
	}
}
