package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.SkripsiModel;
import com.example.demo.repository.ISkripsiRepository;
import com.example.demo.service.ISkripsiService;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class ViewController {
	
	@Autowired
	ISkripsiService skripsiservice;
	
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
	
	@RequestMapping("thymeleaf")
	public String thymeleaf(Model model) {
		List<SkripsiModel> skripsiModelList= new ArrayList<SkripsiModel>();
		skripsiModelList= skripsiservice.readAllData();
		
		model.addAttribute("skripsi", skripsiModelList);
		
		return "/thymeleaf";
	}
}
