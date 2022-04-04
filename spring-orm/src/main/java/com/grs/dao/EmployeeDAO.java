package com.grs.dao;

import java.util.List;

import com.grs.model.Employee;

public interface EmployeeDAO {

	public void saveEmployee(Employee employee);

	public List<Employee> getEmployee();
}
