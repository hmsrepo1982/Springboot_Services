package com.employee.controller;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.employee.config.EmployeeAppConfig;
import com.employee.model.Employee;
import com.employee.service.EmployeeReadService;
import com.employee.service.EmployeeService;
import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

public class EmployeeController {
	
	public static void main(String[] args) {

		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(EmployeeAppConfig.class);

		Employee employeeRecord = new Employee();
		employeeRecord.setEmpFName("Harsha");
		employeeRecord.setEmpId(12345);
		employeeRecord.setEmpLName("shiva");
		

		EmployeeReadService empReadService = ac.getBean(EmployeeReadService.class);
		List<Employee> empName = empReadService.findByName("Harsha");
		System.out.println("....List Size with Harsha " +  empName.size());
		
		EmployeeService empService = ac.getBean(EmployeeService.class);
		 boolean empRecSaved = empService.saveEmployee(employeeRecord);
		System.out.println("....List Size with Harsha " +  empRecSaved);
		

	}

}
