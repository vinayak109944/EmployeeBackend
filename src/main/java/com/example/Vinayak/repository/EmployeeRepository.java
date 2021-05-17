package com.example.Vinayak.repository;


//import javax.validation.Valid;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demoApp.exception.ResourceNotFoundException;
import com.example.Vinayak.model.Employee; 
//import com.example.demoApp.repository.EmployeeRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	

}