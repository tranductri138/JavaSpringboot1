package com.example.manageremp.repository.impl;

import com.example.manageremp.entity.Department;
import com.example.manageremp.repository.DepartmentRepo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class DepartmentRepoImpl implements DepartmentRepo {
    @Override
    public void addDepartment(Department department) {

    }

    @Override
    public void deleteDepartment(String name) {

    }

    @Override
    public void updateDepartment(Department department) {

    }

    @Override
    public Department getDepartment(String name) {
        return null;
    }

    @Override
    public List<Department> searchDepartment(String name, int offset, int maxPerPage) {
        return null;
    }


}
