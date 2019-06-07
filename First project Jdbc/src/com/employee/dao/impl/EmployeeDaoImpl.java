package com.employee.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.employee.dao.EmployeeDao;
import com.employee.entity.EmployeeEntity;
import com.employee.util.DataBaseConnection;

public class EmployeeDaoImpl  implements EmployeeDao{

	@Override
	public ArrayList<EmployeeEntity> getAllEmployee() {
		Connection conn=null;
		Statement smt=null;
		 EmployeeEntity employeeEntity=null;
		 ArrayList<EmployeeEntity> employeeList= new ArrayList<EmployeeEntity>();
		try
		{
			conn=DataBaseConnection.getMysqlConnection();
			smt=conn.createStatement();
			String sql="SELECT * FROM employee";
			ResultSet rs=smt.executeQuery(sql);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int age=rs.getInt(3);
				employeeEntity=new EmployeeEntity(id,name,age);
				employeeList.add(employeeEntity);
				
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return employeeList;
	}

	@Override
	public void createEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement smt=null;
		
		try
		{
			conn=DataBaseConnection.getMysqlConnection();
			smt=conn.createStatement();
			String name=employeeEntity.getName();
			int id=employeeEntity.getId();
			int age=employeeEntity.getAge();
			
			String sql="INSERT INTO employee(id,name,age) values ("+id+",'"+name+"',"+age+")"; 
			boolean isInserted= smt.execute(sql);
			System.out.println(isInserted);
		}catch(Exception e) {
		
	}

}

	@Override
	public EmployeeEntity getEmployeeById(int employeeId) {
		Connection conn=null;
		Statement smt=null;
		 EmployeeEntity employeeEntity=null;
		try
		{
			conn=DataBaseConnection.getMysqlConnection();
			smt=conn.createStatement();
			String sql="SELECT * FROM employee WHERE id= "+employeeId;
			ResultSet rs=smt.executeQuery(sql);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int age=rs.getInt(3);
				employeeEntity=new EmployeeEntity(id,name,age);
				
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return employeeEntity;
	}

	@Override
	public void deleteEmployeeById(int employeeid) {
		Connection conn=null;
		Statement smt=null;
try
{
	conn=DataBaseConnection.getMysqlConnection();
	smt=conn.createStatement();
	
	String sql="DELETE From employee where id="+employeeid;
	boolean isdeleted =smt.execute(sql);
	System.out.println(isdeleted);
	}
catch(SQLException e) {
	e.printStackTrace();
}
		
	}

	@Override
	public void updateEmployee(EmployeeEntity employeeEntity) {
		Connection conn=null;
	     Statement smt=null;
	
	try
	{
		conn=DataBaseConnection.getMysqlConnection();
		smt=conn.createStatement();
		String name=employeeEntity.getName();
		int id=employeeEntity.getId();
		int age=employeeEntity.getAge();
		//UPDATE employee SET name='abc', age=23,WHERE id=5;
		
		String sql="UPDATE employee SET name = '" +name+"', age= "+age+" WHERE id ="+ id;
		boolean isInserted= smt.execute(sql);
		System.out.println(isInserted);
	}catch(Exception e) {
		
	}
}
	
		
	}
