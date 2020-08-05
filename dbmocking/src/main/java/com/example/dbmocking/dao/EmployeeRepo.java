package com.example.dbmocking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.dbmocking.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,String>{

}
