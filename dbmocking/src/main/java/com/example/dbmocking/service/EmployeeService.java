package com.example.dbmocking.service;

import java.util.List;
import java.util.Optional;

import com.example.dbmocking.model.Employee;

public interface EmployeeService {
	
	List<Employee> getEmployeeDetails();
	Optional<Employee> getEmployeeDetail(String EmpId);
	Employee addEmployee(Employee employee);

}
