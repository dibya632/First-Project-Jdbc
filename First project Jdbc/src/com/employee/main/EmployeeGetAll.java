package com.employee.main;

import java.util.ArrayList;

import com.employee.bean.EmployeeBean;
import com.employee.service.impl.EmployeeServiceImpl;

public class EmployeeGetAll {

	public static void main(String[] args) {
		EmployeeServiceImpl employeeServiceImpl=new EmployeeServiceImpl();
        ArrayList<EmployeeBean>EmployeeBeanList=employeeServiceImpl.getAllEmployee();
        for(int i=0;i<EmployeeBeanList.size();i++)
        
        {
        	EmployeeBean employeeBean=EmployeeBeanList.get(i);
        	System.out.println("id="+employeeBean.getId());
        	System.out.println("Name="+employeeBean.getName());
        	System.out.println("Age="+employeeBean.getAge());
        	System.out.println("====================");
        }
	}

}
