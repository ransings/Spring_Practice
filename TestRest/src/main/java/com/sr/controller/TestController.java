package com.sr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@PostMapping("/test")
	public String getParams(@RequestParam("eSignRequest") String xml,@RequestParam("aspTxnID") String txn,@RequestParam("Content-Type") String type) {
		String str="xml= "+xml+"\ntxn="+txn+"\ncontent-type="+type;
		return str;
	} 
	
	@PostMapping("/test1")
	public String getData(@RequestParam("name") String name) {
		System.out.println(name);
		return name;
	}
	
	@PostMapping("/test2")
	public String getData1(@RequestBody String name) {
		System.out.println(name);
		return name;
	}
	
	@GetMapping("/test")
	public String getParam() {
		return "Welcome to Spring Rest";
	}
	
}
