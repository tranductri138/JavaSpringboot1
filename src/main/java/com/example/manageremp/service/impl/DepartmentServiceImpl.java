package com.example.manageremp.service.impl;

import com.example.manageremp.entity.Department;
import com.example.manageremp.model.DepartmentDto;
import com.example.manageremp.repository.DepartmentRepo;
import com.example.manageremp.service.DepartmentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void add(DepartmentDto departmentDto) {
        Department department = mapper.map(departmentDto, Department.class);
        departmentRepo.addDepartment(department);
    }

    @Override
    public void update(DepartmentDto departmentDto) {
        Department department = mapper.map(departmentDto, Department.class);
        departmentRepo.updateDepartment(department);
    }

    @Override
    public void delete(String name) {
        departmentRepo.deleteDepartment(name);
    }

    @Override
    public DepartmentDto getDepartment(String name) {
        Department department = departmentRepo.getDepartment(name);
        return convert(department);
    }


    @Override
    public List<DepartmentDto> searchUser(String name, int offset, int maxPerPage) {
        return null;
    }

    private DepartmentDto convert(Department department) {
        DepartmentDto departmentDto = mapper.map(department, DepartmentDto.class);
        return departmentDto;
    }
}
