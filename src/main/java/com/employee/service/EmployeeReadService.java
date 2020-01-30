package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeReadService {

	Employee findById(String empId);

	List<Employee> findByName(String empName);

	List<Employee> findAll();

}