package com.sr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {

	public String home(RedirectAttributes ra) {
		return "home";
	}
}
