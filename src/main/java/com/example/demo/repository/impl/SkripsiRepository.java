package com.example.demo.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SkripsiModel;
import com.example.demo.repository.ISkripsiRepository;

@Repository
public class SkripsiRepository implements ISkripsiRepository{
	
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int insert(SkripsiModel model) {
		var q= "INSERT INTO skripsi"
				+ "(judul,nilai,tahun)"
				+ "VALUES"
				+ "(?,?,?)";
		return jdbc.update(q,new Object[] { model.getJudul(), model.getNilai(), model.getTahun() });
	}

	@Override
	public List<SkripsiModel> readAllData() {
		// TODO Auto-generated method stub
		var q= "SELECT * FROM skripsi ";
		var result = jdbc.query(q, new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class));
		return result;
	}

	@Override
	public List<SkripsiModel> readCustom() {
		// TODO Auto-generated method stub
		var q= "SELECT * FROM skripsi"
				+ "WHERE ? = ?";
		return null;
	}

	@Override
	public List<SkripsiModel> getEqTahun(Integer tahun) {
		var q= "SELECT * FROM skripsi"
				+ " WHERE tahun = "+tahun;
		var result = jdbc.query(q, 
				new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class)
				);
		return result;
	}

	@Override
	public List<SkripsiModel> getGTTahun(Integer tahun) {
		var q= "SELECT * FROM skripsi"
				+ " WHERE tahun > "+tahun;
		var result = jdbc.query(q, 
				new BeanPropertyRowMapper<SkripsiModel>(SkripsiModel.class)
				);
		return result;
	}

	@Override
	public int gantinilai(Integer id, Integer nilai) {
		var q= "UPDATE skripsi"
				+ " SET nilai = "+ nilai
				+ " WHERE id = "+id;
		return jdbc.update(q);
	}

	@Override
	public int deleteById(Integer id) {
		var q= "DELETE FROM skripsi"
				+ " WHERE id = " + id;
		return jdbc.update(q);
	}
	
}
