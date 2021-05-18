package com.example.manageremp.service.impl;

import com.example.manageremp.model.DepartmentDto;
import com.example.manageremp.repository.DepartmentRepo;
import com.example.manageremp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    @Override
    public void add(DepartmentDto departmentDto) {

    }

    @Override
    public void update(DepartmentDto departmentDto) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public DepartmentDto getUser(Long id) {
        return null;
    }

    @Override
    public List<DepartmentDto> searchUser(String name, int offset, int maxPerPage) {
        return null;
    }
}
