package com.springboot.employee.DAO;

import java.util.List;

import com.springboot.employee.entity.Employee;

public interface EmployeeDAO {
	
	List<Employee> findAll();
	
	Employee findById(int theId);

	Employee save(Employee theEmployee);

	void deleteById(int theId);
	
	}


