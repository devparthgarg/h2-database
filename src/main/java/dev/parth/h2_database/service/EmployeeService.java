package dev.parth.h2_database.service;

import dev.parth.h2_database.entity.Employee;
import dev.parth.h2_database.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Success";
    }
}
