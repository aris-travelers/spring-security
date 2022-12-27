package com.sevensevengsi.springsecurity.dao;

import com.sevensevengsi.springsecurity.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public Optional<Employee> findByUsername(String username);
}
