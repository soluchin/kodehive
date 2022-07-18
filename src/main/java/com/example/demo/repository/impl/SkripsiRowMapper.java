package com.example.demo.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.SkripsiModel;

public class SkripsiRowMapper implements RowMapper<SkripsiModel>{

	@Override
	public SkripsiModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		return null;
	}

}
