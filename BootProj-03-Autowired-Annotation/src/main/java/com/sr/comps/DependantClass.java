package com.sr.comps;

import org.springframework.stereotype.Component;

@Component
public class DependantClass {
	private String str="Dependant";

	public DependantClass() {
		System.out.println("DependantClass.DependantClass()");
	}
}
