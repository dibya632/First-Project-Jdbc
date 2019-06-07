package com.employee.dao;

import java.util.ArrayList;

import com.employee.entity.EmployeeEntity;

public interface EmployeeDao {
	//this is method for crate employee
	public abstract void createEmployee(EmployeeEntity employeeentity);
	//this is method for get all employee
public abstract ArrayList<EmployeeEntity> getAllEmployee();
//this is method for get all employee by id
public abstract EmployeeEntity getEmployeeById(int employeeid);
//this is method for delete employee by id
public abstract void deleteEmployeeById(int employeeid);

public abstract void updateEmployee(EmployeeEntity employeeentity);
}
