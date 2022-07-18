package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SkripsiModel;
import com.example.demo.repository.ISkripsiRepository;
import com.example.demo.service.ISkripsiService;

@Service
public class SkripsiService implements ISkripsiService{
	
	@Autowired
	ISkripsiRepository SkripsiRepository;
	
	@Override
	public int insert(SkripsiModel model) {
		var result= SkripsiRepository.insert(model);
		return result;
	}

	@Override
	public List<SkripsiModel> readAllData() {
		var result = SkripsiRepository.readAllData();
		System.out.println("select success");
		return result;
	}

	@Override
	public List<SkripsiModel> readCustom() {
		var result = SkripsiRepository.readCustom();
		return null;
	}

	@Override
	public List<SkripsiModel> getEqTahun(Integer tahun) {
		var result = SkripsiRepository.getEqTahun(tahun);
		return result;
	}

	@Override
	public List<SkripsiModel> getGTTahun(Integer tahun) {
		var result = SkripsiRepository.getGTTahun(tahun);
		return result;
	}

	@Override
	public int gantiNilai(Integer id,Integer nilai) {
		return SkripsiRepository.gantinilai(id,nilai);
	}

	@Override
	public int deleteById(int id) {
		return SkripsiRepository.deleteById(id);
	}
}
