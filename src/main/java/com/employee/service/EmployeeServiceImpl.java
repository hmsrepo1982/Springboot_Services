package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDAO;
import com.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO empDAO;
	
	public boolean saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empDAO.saveEmployee(employee);
	}

	public Employee findById(String empId) {
		// TODO Auto-generated method stub
		return empDAO.findById(empId);
	}

	public List<Employee> findByName(String empName) {
		// TODO Auto-generated method stub
		return empDAO.findByName(empName);
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return empDAO.findAll();
	}

	public boolean deleteByEmpId(String empId) {
		// TODO Auto-generated method stub
		return empDAO.deleteByEmpId(empId);
	}

}
