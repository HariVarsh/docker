package com.mindtree.docker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity	
public class Employee {

	@Id
	private int employeeId;
	private String employeeName;
	private String role;
	private int age;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(int employeeId, String employeeName, String role, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.role = role;
		this.age = age;
	}
	public Employee() {
		super();
	}
	
	
}
