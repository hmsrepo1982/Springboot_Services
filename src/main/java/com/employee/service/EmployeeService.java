package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {

	boolean saveEmployee(Employee Employee);

	Employee findById(String empId);

	List<Employee> findByName(String empName);

	List<Employee> findAll();

	boolean deleteByEmpId(String empId);

}