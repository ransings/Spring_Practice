package com.sr.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "StudentInfo")
@Data
public class Student {
	@Id
	private Integer id;
	private String name;
	@Column(name = "DOB")
	private Date birthDate;
	private Double salary;

}
