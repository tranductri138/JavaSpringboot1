package com.example.manageremp.repository.impl;

import com.example.manageremp.entity.Employee;
import com.example.manageremp.repository.EmployeeRepo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Transactional
@Repository
public class EmployeeRepoImpl implements EmployeeRepo {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void add(Employee emp) {
        entityManager.persist(emp);
    }
}