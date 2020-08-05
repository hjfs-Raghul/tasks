package com.example.dbmocking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dbmocking.dao.EmployeeRepo;
import com.example.dbmocking.model.Employee;

public class EmployeeServiceImplementation implements EmployeeService {

	 @Autowired 
	 private EmployeeRepo employeeRepo;
	

	@Override
	public List<Employee> getEmployeeDetails() {
		return employeeRepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeDetail(String empId) {
		return employeeRepo.findById(empId);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);

	}

}
