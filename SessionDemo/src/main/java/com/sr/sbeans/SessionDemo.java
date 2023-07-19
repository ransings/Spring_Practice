package com.sr.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class SessionDemo {

	public SessionDemo() {
		System.out.println("SessionDemo.SessionDemo()");
	}

}
