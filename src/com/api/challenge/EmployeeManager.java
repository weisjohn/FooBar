package com.api.challenge;

import java.util.List;


public interface EmployeeManager {


	public List<Employee> findEmployeesByDepartment(String department);
    public Employee findEmployeeById(int id);

    public int getEmployeeCount();
    // This method should return a list of employees sorted by department and then last name
    public List<Employee> getAllEmployeesSortedByDept();
    public void addEmployee(Employee employee);
    public void removeEmployee(int id);
    
}
