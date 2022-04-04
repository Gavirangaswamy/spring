package com.grs.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grs.dao.EmployeeDAOImpl;
import com.grs.model.Employee;

public class Runner {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context =  new ClassPathXmlApplicationContext("context.xml");
		
		Employee employee = new Employee();
		employee.setCity("Turuvekere");
		employee.setName("Nagesh");
		employee.setSalary(8000000);
		
		EmployeeDAOImpl impl = context.getBean(EmployeeDAOImpl.class);
		impl.saveEmployee(employee);
//		List<Employee> employees = impl.getEmployee();
//		System.out.println(employees);
	}
}
