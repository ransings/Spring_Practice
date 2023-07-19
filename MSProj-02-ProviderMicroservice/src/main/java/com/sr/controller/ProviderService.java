package com.sr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderService {
	
	@GetMapping("/info")
	public ResponseEntity<String> getInfo(){
		return new ResponseEntity<String>("This is provider application",HttpStatus.OK);
	}

}
