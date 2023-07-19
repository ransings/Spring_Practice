package com.sr.sbeans;

import org.springframework.stereotype.Component;

@Component
public class SingletonDemo {
	SingletonDemo(){
		System.out.println("SingletonDemo.SingletonDemo()");
	}

}
