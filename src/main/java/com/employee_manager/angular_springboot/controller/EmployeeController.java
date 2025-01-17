package com.employee_manager.angular_springboot.controller;

import com.employee_manager.angular_springboot.model.Employee;
import com.employee_manager.angular_springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    //Get all employees
    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    //Add Employee
    @PostMapping("addEmployee")
    public void addEmployee(Employee emp){
        employeeRepository.save(emp);
    }

    //Update Employee
}
