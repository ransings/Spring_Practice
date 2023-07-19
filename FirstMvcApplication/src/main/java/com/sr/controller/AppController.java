package com.sr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("con")
public class AppController {
public AppController() {
	System.out.println("AppController.AppController()");
}
	@RequestMapping("/info")
	public String getView() {
		System.out.println("AppController.getView()");
		return "index"; 
	}
	
	@RequestMapping("/version")
	public String getVersion() {
		return "version"; 
	}
}
