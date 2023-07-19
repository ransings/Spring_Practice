package com.sr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sr.sbeans.SessionDemo;
import com.sr.sbeans.SingletonDemo;

@Controller
public class TestController {
	@Autowired
	SessionDemo demo;
	@Autowired
	SingletonDemo demo1;
}
