package com.sr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sr.sbeans.EsignResp;

@RestController
@RequestMapping("/xml")
public class MarshallingController {

	@PostMapping("/response")
	public ResponseEntity<EsignResp> getResponse(@RequestBody EsignResp response){
		System.out.println(response.toString());
		return new ResponseEntity<EsignResp>(response,HttpStatus.OK);
	}
	
	
}

