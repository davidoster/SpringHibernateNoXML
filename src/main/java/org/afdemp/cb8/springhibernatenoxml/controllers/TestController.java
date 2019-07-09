/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.cb8.springhibernatenoxml.controllers;

import java.util.List;
import org.afdemp.cb8.springhibernatenoxml.models.Employee;
import org.afdemp.cb8.springhibernatenoxml.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author George.Pasparakis
 */
@Controller
@RequestMapping("/")
public class TestController {
    @Autowired
    EmployeeService service;
    
    @RequestMapping(value = {"/", "/test"}, method = RequestMethod.GET)
    public String test(ModelMap model) {
        List<Employee> employees = service.findAllEmployees();
        model.addAttribute("employees", employees);
        model.addAttribute("test", "This is a test!");
        return "test";
    }
    
}
