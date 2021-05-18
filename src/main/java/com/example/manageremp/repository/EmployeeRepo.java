package com.example.manageremp.repository;

import com.example.manageremp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo {
    void add(Employee emp);
    void update(Employee emp);
    void delete(Long id);
    Employee getEmp(Long id);
    List<Employee> searchEmp(String name);
    List<Employee> searchEmp(String name, int offset,int maxPerPage);
}
