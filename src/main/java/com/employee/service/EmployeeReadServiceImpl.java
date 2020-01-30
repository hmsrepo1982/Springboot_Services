package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeReadDAO;
import com.employee.model.Employee;

@Service
public class EmployeeReadServiceImpl implements EmployeeReadService {
	
	@Autowired
	private EmployeeReadDAO employeeReadDAO;

	public Employee findById(String empId) {
		// TODO Auto-generated method stub
		return employeeReadDAO.findById(empId);
	}

	public List<Employee> findByName(String empName) {
		// TODO Auto-generated method stub
		return employeeReadDAO.findByName(empName);
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeReadDAO.findAll();
	}

}
