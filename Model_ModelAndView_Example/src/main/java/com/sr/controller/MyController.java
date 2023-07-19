package com.sr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/model")
	public String getModel(Model model) {
		List< Integer> roll_no=new ArrayList<>();
		roll_no.add(10);
		roll_no.add(20);
		
		String name[]= {"Ajay","Vijay"};
		
		model.addAttribute("roll",roll_no);
		model.addAttribute("name",name);
		return "model";		
	}
	
	@RequestMapping("/modelnview")
	public ModelAndView getModel(ModelAndView model) {
		List< Integer> roll_no=new ArrayList<>();
		roll_no.add(11);
		roll_no.add(12);
		
		String name[]= {"Mahesh","Ganesh"};
		
		model.addObject("roll",roll_no);
		model.addObject("name",name);
		model.setViewName("modelnview");	
		return model;		
	}
	
}
