package com.sr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/provider")
public class ProducerController {
	
	@PostMapping("info")
	public ResponseEntity<String> getInfo(@RequestParam String user){
		return new ResponseEntity<String>("Welcome to provider application:"+user,HttpStatus.OK);
	}

}
