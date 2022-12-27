package com.sevensevengsi.springsecurity.config;

import com.sevensevengsi.springsecurity.dao.EmployeeRepository;
import com.sevensevengsi.springsecurity.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@EnableJpaRepositories(basePackages = "com.sevensevengsi.springsecurity.dao")
public class UserServiceConfig implements UserDetailsService {

    @Autowired
    public EmployeeRepository employeeRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<Employee> employee = employeeRepository.findByUsername(username);

        if (employee.isPresent()) {
            return new UserConfig(employee.get());
        }

        throw new UsernameNotFoundException("user not available");
    }

}