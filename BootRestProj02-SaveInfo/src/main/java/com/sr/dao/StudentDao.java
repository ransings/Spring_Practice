package com.sr.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sr.model.Student;


public interface StudentDao extends JpaRepository<Student, Integer> {

}
