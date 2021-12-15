package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@Autowired
	
	private StudentService studservice;
	
	@GetMapping("/students")
	public List<Students> findall()
	{
		return studservice.getAllStudents();
	}
	
	@RequestMapping(path = "/addstudents", method = RequestMethod.POST)
	public String addStudents(@RequestBody Students studs)
	{
		return studservice.addStudents(studs);
	}
	
	@GetMapping("/students/{id}")
	public Optional<Students> findbyid(@PathVariable("id") Long id)
	{
		return studservice.findbyid(id);
	}
	
}
