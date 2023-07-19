package com.sr.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company {
	private int id;
	private String name;
	private Project project;

}
