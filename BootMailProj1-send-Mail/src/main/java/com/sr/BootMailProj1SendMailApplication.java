package com.sr;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.sr.mail.MailSenderClass;

@SpringBootApplication
public class BootMailProj1SendMailApplication {
	
	public static void main(String[] args) {
		
		System.out.println("01000427Px8DdC7E7GOMBeDXGQeYjOMnORWhae0Tm/tLKpw6ZXCoRyKIFJEAhh2UH7ntiNsj".length());
		ApplicationContext ctx= SpringApplication.run(BootMailProj1SendMailApplication.class, args);
		
		MailSenderClass msc=ctx.getBean("sender",MailSenderClass.class);
		try {
			String msg=msc.sendMail("Hi...This is test mail..");
			System.out.println(msg);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Bean
	public JavaMailSender mailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtp.gmail.com");
		mailSender.setPort(587);
		mailSender.setUsername("shubhamransing011@gmail.com");
		mailSender.setPassword("wmjmqlobhnfglpbq");	
		Properties props=new Properties();
		props.put("mail.smtp.auth", true);
	//	props.put("mail.smtp.socketFactory.port", 587);
	//	props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.port", 587);
		mailSender.setJavaMailProperties(props);
		return mailSender;
	}

}
