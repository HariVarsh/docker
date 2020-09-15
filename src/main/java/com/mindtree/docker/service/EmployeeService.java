package com.mindtree.docker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.docker.entity.Employee;
import com.mindtree.docker.repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;
		public List<Employee> display() {
			return employeeRepo.findAll();
		}
		public void add(Employee employee) {
			employeeRepo.save(employee);
			
		}
}
