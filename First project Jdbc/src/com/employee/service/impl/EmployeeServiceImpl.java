package com.employee.service.impl;

import java.util.ArrayList;

import com.employee.bean.EmployeeBean;
import com.employee.dao.impl.EmployeeDaoImpl;
import com.employee.entity.EmployeeEntity;
import com.employee.service.EmployeeService;

 public class EmployeeServiceImpl implements EmployeeService {
	

	@Override
	public ArrayList<EmployeeBean> getAllEmployee() {
		EmployeeDaoImpl employeeDaoImpl=new EmployeeDaoImpl();
		ArrayList<EmployeeEntity> employeeEntityList=employeeDaoImpl.getAllEmployee();
		ArrayList<EmployeeBean> employeeBeanList=new ArrayList<EmployeeBean>();
		for(int i=0;i<employeeEntityList.size();i++) {
			EmployeeEntity employeeEntity= employeeEntityList.get(i);
			EmployeeBean employeeBean= new EmployeeBean(employeeEntity.getId(), employeeEntity.getName(), employeeEntity.getAge());
			employeeBeanList.add(employeeBean);
		}
		return employeeBeanList;
	}

	@Override
	public void createEmployee(EmployeeBean employeeBean) {
		// TODO Auto-generated method stub
		EmployeeDaoImpl employeeImpl=new EmployeeDaoImpl();
		EmployeeEntity employeeEntity= new EmployeeEntity(employeeBean.getId(),employeeBean.getName(),employeeBean.getAge());
		employeeImpl.createEmployee(employeeEntity);
	}

	@Override
	public EmployeeBean getEmployeeById(int employeeid) {
		EmployeeDaoImpl employeeDaoImpl=new EmployeeDaoImpl();
		
		EmployeeEntity employeeEntity=employeeDaoImpl.getEmployeeById(employeeid);
		EmployeeBean employeeBean=new EmployeeBean(employeeEntity.getId(),employeeEntity.getName(),employeeEntity.getAge());
		
		return employeeBean;
	}

	@Override
	public void deleteEmployeById(int emloyeeId) {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		
		employeeDaoImpl.deleteEmployeeById(2);
		
	}

	@Override
	public void updateEmployee(EmployeeBean employeeBean) {
		EmployeeDaoImpl employeeImpl=new EmployeeDaoImpl();
		EmployeeEntity employeeEntity= new EmployeeEntity(employeeBean.getId(),employeeBean.getName(),employeeBean.getAge());
		employeeImpl.updateEmployee(employeeEntity);
		
	}
	

	}


