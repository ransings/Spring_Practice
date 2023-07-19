package com.sr.mail;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Component("sender")
public class MailSenderClass {
	@Autowired
	private JavaMailSender sender;
	
	private String userName="shubhamransing011@gmail.com";
	
	
	public String sendMail(String msg)throws Exception {
		MimeMessage message=sender.createMimeMessage();
		MimeMessageHelper helper= new MimeMessageHelper(message,false);
		helper.setFrom(userName);
		helper.setTo("adityadharmadhikari34@gmail.com");
		helper.setSentDate(Calendar.getInstance().getTime());
		helper.setSubject("First Mail From Spring Application");
		helper.setText(msg);
		
		sender.send(message);
		return "Message Sent Successfully";	
	}

}
