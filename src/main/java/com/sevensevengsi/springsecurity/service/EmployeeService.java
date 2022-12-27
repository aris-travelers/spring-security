package com.sevensevengsi.springsecurity.service;


import com.sevensevengsi.springsecurity.model.Employee;

import java.util.List;

public interface EmployeeService {
	public Employee findByUsername(String username);
}
