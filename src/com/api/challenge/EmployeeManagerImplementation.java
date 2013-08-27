package com.api.challenge;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerImplementation implements EmployeeManager {

	public List<Employee> employees;
	
	// initialize our list
	public EmployeeManagerImplementation() {
		employees = new ArrayList<Employee>();
	}
	
	@Override
	public List<Employee> findEmployeesByDepartment(String department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getEmployeeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> getAllEmployeesSortedByDept() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

}
