package com.example.dbmocking.controller;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbmocking.DbmockingApplication;
import com.example.dbmocking.model.Employee;
import com.example.dbmocking.service.EmployeeService;

import aj.org.objectweb.asm.Type;

import org.mockito.runners.MockitoJUnitRunner;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmployee(@RequestBody Employee employee) {
		Employee addedEmployee = new Employee();
		addedEmployee = employeeService.addEmployee(employee);
		return addedEmployee;
	}

	@GetMapping(value = "/get/{id}")
	public Optional<Employee> getEmployeeDetails(@PathVariable(value = "id") String EmpId) {
		return employeeService.getEmployeeDetail(EmpId);
	}

	@GetMapping(value = "/get")
	public List<Employee> getEmployeeDetail(){
		return employeeService.getEmployeeDetails();
	}
	 
}
