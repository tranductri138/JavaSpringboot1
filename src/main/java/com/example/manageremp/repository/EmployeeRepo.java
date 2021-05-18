package com.example.manageremp.repository;

import com.example.manageremp.entity.Employee;

import java.util.List;

public interface EmployeeRepo {
    void add(Employee emp);

    void update(Employee emp);

    void delete(Long id);

    Employee getEmp(Long id);

    List<Employee> searchEmp(String name);

    List<Employee> searchEmp(String name, int offset, int maxPerPage);
}
