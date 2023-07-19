package com.sr.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Project {
	private int id;
	private String name;
	private double budget;
	private Employee emp;
	
	
}
