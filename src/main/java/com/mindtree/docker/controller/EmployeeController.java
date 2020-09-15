package com.mindtree.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.docker.entity.Employee;
import com.mindtree.docker.service.EmployeeService;
@CrossOrigin
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/employees")
	public List<Employee> displayEmployees (){
		return employeeService.display();
	}
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.add(employee);
	}
	@GetMapping("")
	public String test() {
		return "your spring boot app is running within ec2";
	}
}
