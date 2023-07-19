package com.sr;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sr.controller.StudentController;
import com.sr.dao.StudentDao;

@SpringBootApplication
public class MvcWithJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(MvcWithJpaApplication.class, args);
	}

}
