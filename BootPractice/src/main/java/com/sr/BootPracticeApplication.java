package com.sr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootPracticeApplication.class, args);
		ctx.getBean("target");
	}

}
