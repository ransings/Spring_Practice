package com.sr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
private int id;
private String name;
private Double salary;
private String location="Mumbai";
}
