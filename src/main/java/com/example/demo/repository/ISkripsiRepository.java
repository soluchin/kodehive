package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.SkripsiModel;

public interface ISkripsiRepository {
	public int insert(SkripsiModel model);
	public List<SkripsiModel> readAllData();
	public List<SkripsiModel> readCustom();
	public List<SkripsiModel> getEqTahun(Integer tahun);
	public List<SkripsiModel> getGTTahun(Integer tahun);
	public int gantinilai(Integer id, Integer nilai);
	public int deleteById(Integer id);
}
