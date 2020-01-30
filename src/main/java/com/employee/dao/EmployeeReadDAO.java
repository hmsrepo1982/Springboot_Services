package com.employee.dao;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeReadDAO {

	

	Employee findById(String empId);

	// find Employees by name
	List<Employee> findByName(String empName);

	List<Employee> findAll();

	

}