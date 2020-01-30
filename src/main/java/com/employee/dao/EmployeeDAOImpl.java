package com.employee.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeReadDAO, EmployeeDAO {
	
	public EmployeeDAOImpl() {
		System.out.println("--- Employee DAO Impl Class is called...");
	}

	// Employee DAO Operations

	// save Employee

	/* (non-Javadoc)
	 * @see com.employee.dao.EmployeeDAO#saveEmployee(com.employee.model.Employee)
	 */
	public boolean saveEmployee(Employee Employee) {
		System.out.println("DAO: Employee " + Employee.getEmpFName() + "  saved to Database...");
		// code to save Employee object into database
		return true;
	}

	// find Employee by Employee Id

	/* (non-Javadoc)
	 * @see com.employee.dao.EmployeeDAO#findById(java.lang.String)
	 */
	public Employee findById(String empId) {

		return null;
	}

	// find Employees by name
	/* (non-Javadoc)
	 * @see com.employee.dao.EmployeeDAO#findByName(java.lang.String)
	 */
	public List<Employee> findByName(String empName) {
		
		List<Employee> emplist = new ArrayList<Employee>();
		// Add Employee or retrieve Employee.
		

		return emplist;
	}


	/* (non-Javadoc)
	 * @see com.employee.dao.EmployeeDAO#findAll()
	 */
	public List<Employee> findAll() {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see com.employee.dao.EmployeeDAO#deleteByEmpId(java.lang.String)
	 */
	public boolean deleteByEmpId(String empId) {
		
		return true;
	}

}
