package com.sevensevengsi.springsecurity.controller;

import com.sevensevengsi.springsecurity.dao.EmployeeRepository;
import com.sevensevengsi.springsecurity.service.EmployeeService;
import com.sevensevengsi.springsecurity.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

    @GetMapping("/all")
    public String forAll() {
        return "forAll/page1";
    }

    @GetMapping("/manager")
    public String forManager() {
        return "forAuthenticated/page2";
    }

    @GetMapping("/admin")
    public String forAdmin() {
        return "forAuthenticated/page3";
    }

    @GetMapping("/employee")
    public String forEmployee() {
        return "forAuthenticated/page4";
    }
}
