package com.api.challenge;

import java.util.ArrayList;
import java.util.List;

import com.api.challenge.Employee;

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
		for (int i = 0; i < employees.size() - 1; i++) {
			if (employees.get(i).id == id) {
				return employees.get(i);
			}
		}
		return null;
	}

	@Override
	public int getEmployeeCount() {
		return employees.size();
	}

	@Override
	public List<Employee> getAllEmployeesSortedByDept() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	@Override
	public void removeEmployee(int id) {
		for (int i = 0; i < employees.size() - 1; i++) {
			if (employees.get(i).id == id) {
				employees.remove(i);
			}
		}
		
	}

}
