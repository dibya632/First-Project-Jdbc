package com.employee.entity;

public class EmployeeEntity {

	private int id;
	private String name;
	private int age;
	public EmployeeEntity(int id,String name,int age) {
		super();
		this.id=id;
		this.age=age;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	}

