package com.example.manageremp.service.impl;

import com.example.manageremp.entity.Employee;
import com.example.manageremp.model.EmployeeDto;
import com.example.manageremp.repository.EmployeeRepo;
import com.example.manageremp.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void add(EmployeeDto empdto) {
        Employee employee = mapper.map(empdto,Employee.class);
        employeeRepo.add(employee);
    }
}
