package com.example.EmployeeManagement.Repository;

import com.example.EmployeeManagement.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// I'll be back
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
