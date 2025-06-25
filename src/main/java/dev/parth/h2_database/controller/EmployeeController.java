package dev.parth.h2_database.controller;

import dev.parth.h2_database.entity.Employee;
import dev.parth.h2_database.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("v1/get/all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("v1/create")
    public String addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
}
