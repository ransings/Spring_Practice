package com.sr.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sr.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	public List<Employee> findByName(String name);
	public List<Employee> findByNameStartingWith(String name);

}
