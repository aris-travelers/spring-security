package com.sevensevengsi.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//		(exclude = { SecurityAutoConfiguration.class })
//@ComponentScan(basePackages = {"com.sevensevengsi.springsecurity.dao"})
//@ComponentScan({"com.sevensevengsi.springsecurity.dao"})
//@EnableJpaRepositories("com.sevensevengsi.springsecurity")
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

}
