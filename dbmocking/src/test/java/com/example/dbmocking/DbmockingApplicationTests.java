package com.example.dbmocking;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.Assert;

import com.example.dbmocking.DbmockingApplication;
import com.example.dbmocking.model.Employee;
import com.example.dbmocking.service.EmployeeService;

import aj.org.objectweb.asm.Type;

import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dbmocking.controller.EmployeeController;

@SpringBootTest
class DbmockingApplicationTests {

	@InjectMocks 
	DbmockingApplication DbmockingApplication = new
			  DbmockingApplication();
	
	@Mock 
	EmployeeController employeeController;
	
	@Test
	void contextLoads() {
	}
	
	@Test public void testAddEmployee(Employee employee) {
	  when(employeeController.addEmployee(employee)).thenReturn(employee); 
	  }

}
	  
	  
	  
	  
	  
	  
	  
	  