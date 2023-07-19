package com.sr.controller;

import java.time.LocalDateTime;
import java.util.Calendar;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class FirstController {
	
	@GetMapping("/hello/{user}")
	public ResponseEntity<String> getMessage(@PathVariable String user){
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();		
		String msg="";
		
		if(hour<3)
			msg="Good Night ";
		else if(hour<12)
			msg="Good Morning ";
		else if(hour<16)
			msg="Good Afternoon ";
		else if(hour<20)
			msg="Good Evening ";
		else
			msg="Good Night ";
		
		return new ResponseEntity<String>(msg+user,HttpStatus.OK);
		
	}

}
