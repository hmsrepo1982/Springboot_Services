package com.employee.dao;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeDAO {

	/* (non-Javadoc)
	 * @see com.employee.dao.EmployeeDAO#saveEmployee(com.employee.model.Employee)
	 */
	boolean saveEmployee(Employee Employee);

	/* (non-Javadoc)
	 * @see com.employee.dao.EmployeeDAO#findById(java.lang.String)
	 */
	Employee findById(String empId);

	// find Employees by name
	/* (non-Javadoc)
	 * @see com.employee.dao.EmployeeDAO#findByName(java.lang.String)
	 */
	List<Employee> findByName(String empName);

	/* (non-Javadoc)
	 * @see com.employee.dao.EmployeeDAO#findAll()
	 */
	List<Employee> findAll();

	/* (non-Javadoc)
	 * @see com.employee.dao.EmployeeDAO#deleteByEmpId(java.lang.String)
	 */
	boolean deleteByEmpId(String empId);

}