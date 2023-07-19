package com.sr.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes(names = {"date"})
public class SessionMngrController {
	@Autowired
	private HttpSession session;
	
	@GetMapping("/")
	public String getHome() {
		return "index1";
	}
	
	@GetMapping("/create")
	public String createSession(HttpServletRequest req) {
		System.out.println("Session is created as:"+req.getSession());
		return "useSession";
	}
	
	@GetMapping("/useSession")
	public String useSession(HttpServletRequest req) {
		System.out.println("Record is updated for session ID:"+req.getSession());
		return "index1";
	}

}
