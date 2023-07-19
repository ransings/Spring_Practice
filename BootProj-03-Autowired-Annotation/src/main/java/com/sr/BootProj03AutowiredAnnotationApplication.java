package com.sr;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sr.comps.TargetClass;

@SpringBootApplication
public class BootProj03AutowiredAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj03AutowiredAnnotationApplication.class, args);
		
		System.out.println(ctx.getBean("target",TargetClass.class).getDependantClass());
	}

}
