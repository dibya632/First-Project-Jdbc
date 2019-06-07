package com.employee.service;

import java.util.ArrayList;

import com.employee.bean.EmployeeBean;

 
public interface EmployeeService {
	public abstract void createEmployee(EmployeeBean employeebean);
	public abstract ArrayList<EmployeeBean>getAllEmployee();
	
	public abstract EmployeeBean getEmployeeById(int employeeid);
	
	public abstract void deleteEmployeById(int EmloyeeId);
	
	public abstract void updateEmployee(EmployeeBean employeebean);
}
