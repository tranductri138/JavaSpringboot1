package com.example.manageremp.repository.impl;

import com.example.manageremp.entity.Employee;
import com.example.manageremp.repository.EmployeeRepo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional
@Repository
public class EmployeeRepoImpl implements EmployeeRepo {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void add(Employee emp) {
        entityManager.persist(emp);
    }

    @Override
    public void update(Employee emp) {
        entityManager.merge(emp);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(getEmp(id));
    }

    @Override
    public Employee getEmp(Long id) {
        return entityManager.find(Employee.class,id);
    }

    @Override
    public List<Employee> searchEmp(String name) {
        String jql = "select e from Employee e where e.name like :name";
        return entityManager.createQuery(jql,Employee.class)
                .setParameter("name","%"+name+"%").getResultList();
    }

    @Override
    public List<Employee> searchEmp(String name, int start, int length) {
        String jql = "select e from Employee e where e.name like :name";
        return entityManager.createQuery(jql,Employee.class).setParameter("name","%"+name+"%")
                .setFirstResult(start).setMaxResults(length).getResultList();
    }
}