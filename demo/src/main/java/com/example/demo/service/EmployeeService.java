package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.EmployeeRepo;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    public Employee saveEmployee(Employee employee){
        return employeeRepo.save(employee);
    }
    public List<Employee> getEmployee(){
        return employeeRepo.findAll();
    }
}
