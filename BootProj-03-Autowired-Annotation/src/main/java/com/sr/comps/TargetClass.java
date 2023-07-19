package com.sr.comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("target")
public class TargetClass {
	@Autowired
	private DependantClass dependantClass;

	public DependantClass getDependantClass() {
		return dependantClass;
	}
	
	public TargetClass() {
		System.out.println("TargetClass.TargetClass()");
	}
}
 