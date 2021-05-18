package com.example.manageremp.repository;

import com.example.manageremp.entity.Department;

import java.util.List;

public interface DepartmentRepo {
    void addDepartment(Department department);

    void deleteDepartment(String name);

    void updateDepartment(Department department);

    Department getDepartment(String name);

    List<Department> searchDepartment(String name, int offset, int maxPerPage);
}
