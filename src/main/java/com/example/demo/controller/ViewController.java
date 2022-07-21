package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	@RequestMapping("/view")
	public String view() {
		return "/home";
	}
	
	@RequestMapping("/learn")
	public String learn() {
		return "/learnfe";
	}
	
	@RequestMapping("quizhtmljs")
	public String quizhtmljs() {
		return "/quizhtmljs";
	}
	
	@RequestMapping("learnjquery")
	public String learnjqury() {
		return "/learnjquery";
	}
}
