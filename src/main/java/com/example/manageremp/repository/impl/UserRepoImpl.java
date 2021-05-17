package com.example.manageremp.repository.impl;

import com.example.manageremp.entity.User;
import com.example.manageremp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class UserRepoImpl implements UserRepo {
    @Autowired
    private EntityManager entityManager;

    @Override
    public User getUserByName(String name) {
        String jql = "select u from User u where u.name = :name";
        return entityManager.createQuery(jql,User.class).setParameter("name",name).getSingleResult();
    }
}
