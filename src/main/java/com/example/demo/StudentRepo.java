package com.example.demo;


import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface StudentRepo extends JpaRepository<Students, Long> 
{

	@Query("select s from Students s where s.department.id = ?1")
	List<Students> getStudByDeptId(Integer id);
	
	
}
