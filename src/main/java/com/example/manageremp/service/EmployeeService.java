package com.example.manageremp.service;

import com.example.manageremp.model.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    void add(EmployeeDto empdto);

    void update(EmployeeDto employeeDto);

    void delete(Long id);

    EmployeeDto getEmp(Long id);

    List<EmployeeDto> searchEmp(String name, int offset, int maxPerPage);

    List<EmployeeDto> searchEmp(String name);
}
