package com.example.EmployeeManagement.Service;

import com.example.EmployeeManagement.Entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAll();
    Optional<Employee> findById(Long id);
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Long id);

}
