package com.example.demo;

import java.util.*;
import javax.persistence.*;




@Entity
public class Department 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	
	public int getId() {
	return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public List<Students> getStuds() {
//		return studs;
//	}
//	public void setStuds(List<Students> studs) {
//		this.studs = studs;
//	}

		
}
