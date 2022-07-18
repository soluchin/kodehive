package com.example.demo.service;

import java.util.List;

import com.example.demo.model.SkripsiModel;

public interface ISkripsiService {

	int insert(SkripsiModel model);

	List<SkripsiModel> readAllData();
	List<SkripsiModel> readCustom();
	List<SkripsiModel> getEqTahun(Integer tahun);
	List<SkripsiModel> getGTTahun(Integer tahun);

	int gantiNilai(Integer id, Integer nilai);

	int deleteById(int id);
}
