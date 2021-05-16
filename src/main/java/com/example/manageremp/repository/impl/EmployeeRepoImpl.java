package com.example.manageremp.repository.impl;

import com.example.manageremp.entity.Employee;
import com.example.manageremp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;


@Transactional
@Repository
public class EmployeeRepoImpl implements EmployeeRepo {

    @Autowired
    EntityManager entityManager;

    @Override
    public void add(Employee emp) {
        entityManager.persist(emp);
    }
}