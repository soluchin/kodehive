package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "skripsi")
public class SkripsiModel {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String judul;
	private int nilai;
	private int tahun;
}
