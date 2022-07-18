package com.example.demo.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SkripsiModel;
import com.example.demo.service.ISkripsiService;

@RestController
@RequestMapping("/api")
public class MainController {
	
	@Autowired
	ISkripsiService SkripsiService;
	
	@PostMapping("/insert")
	public String beranda(@RequestBody SkripsiModel model) {
		SkripsiService.insert(model);
		return "success";
	}
	
	@GetMapping("/readall")
	public List<SkripsiModel> getAllData(){
		return SkripsiService.readAllData();
	}
	
	@GetMapping("geteqtahun")
	public List<SkripsiModel> getEqTahun(@RequestParam Integer tahun){
		return SkripsiService.getEqTahun(tahun);
	}
	
	@GetMapping("getgttahun")
	public List<SkripsiModel> getGTTahun(@RequestParam Integer tahun){
		return SkripsiService.getGTTahun(tahun);
	}
	
	@GetMapping("deletebyid")
	public String deleteById(@RequestParam int id) {
		return "update success "+ SkripsiService.deleteById(id);
	}
	
	@PutMapping("gantinilai")
	public String putNilai(@RequestParam int id, int nilai) {
		return "update success "+ SkripsiService.gantiNilai(id, nilai);
	}
}
