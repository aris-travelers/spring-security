package com.sevensevengsi.springsecurity.service;

import com.sevensevengsi.springsecurity.dao.EmployeeRepository;
import com.sevensevengsi.springsecurity.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee findByUsername(String username) {
		Optional<Employee> result = employeeRepository.findByUsername(username);
		
		Employee employee = null;
		
		if (result.isPresent()) {
			employee = result.get();
		}
		else {
			throw new RuntimeException("Can't find employee username: " + username);
		}
		
		return employee;
	}
}






