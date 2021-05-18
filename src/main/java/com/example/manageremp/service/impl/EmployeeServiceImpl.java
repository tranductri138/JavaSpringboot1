package com.example.manageremp.service.impl;

import com.example.manageremp.entity.Employee;
import com.example.manageremp.exception.NotFoundException;
import com.example.manageremp.model.EmployeeDto;
import com.example.manageremp.repository.EmployeeRepo;
import com.example.manageremp.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void add(EmployeeDto empdto) {
        Employee employee = mapper.map(empdto, Employee.class);
        employeeRepo.add(employee);
    }

    @Override
    public void update(EmployeeDto employeeDto) {
        Employee employee = employeeRepo.getEmp(employeeDto.getId());
        if (employee != null) {
            employee = mapper.map(employeeDto, Employee.class);
            employeeRepo.update(employee);
        }
    }

    @Override
    public void delete(Long id) {
        Employee employee = employeeRepo.getEmp(id);
        if (employee != null) {
            employeeRepo.delete(id);
        }
    }

    @Override
    public EmployeeDto getEmp(Long id) {
        Employee employee = employeeRepo.getEmp(id);
        if (employee==null){
            throw new NotFoundException("User không tồn tại trong hệ thống");
        }else {
            EmployeeDto employeeDto = mapper.map(employee, EmployeeDto.class);
            return employeeDto;
        }
    }


    @Override
    public List<EmployeeDto> searchEmp(String name, int offset, int maxPerPage) {
        List<Employee> employeeList = employeeRepo.searchEmp(name, offset, maxPerPage);
        List<EmployeeDto> employeeDtos = new ArrayList<>();
        if (employeeList.isEmpty()) {
            throw new NotFoundException("User không tồn tại trong hệ thống");
        } else {
            for (Employee e : employeeList) {
                employeeDtos.add(mapper.map(e, EmployeeDto.class));
            }
            return employeeDtos;
        }
    }

    @Override
    public List<EmployeeDto> searchEmp(String name) {
        List<Employee> employeeList = employeeRepo.searchEmp(name);
        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        if (employeeList.isEmpty()){
            throw new NotFoundException("User không tồn tại trong hệ thống");
        }else {
            for (Employee e: employeeList){
                employeeDtoList.add(mapper.map(e,EmployeeDto.class));
            }
            return employeeDtoList;
        }
    }
}
