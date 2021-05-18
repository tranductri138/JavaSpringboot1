package com.example.manageremp.repository.impl;

import com.example.manageremp.entity.Department;
import com.example.manageremp.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
@Transactional
public class DepartmentRepoImpl implements DepartmentRepo {
    @Autowired
    private EntityManager entityManager;

    @Override
    public void addDepartment(Department department) {
        entityManager.merge(department);
    }

    @Override
    public void deleteDepartment(String name) {
        entityManager.remove(getDepartment(name));
    }

    @Override
    public void updateDepartment(Department department) {
        entityManager.merge(department);
    }

    @Override
    public Department getDepartment(String name) {
        return entityManager.find(Department.class, name);
    }

    @Override
    public List<Department> searchDepartment(String name, int offset, int maxPerPage) {
        return null;
    }


}
