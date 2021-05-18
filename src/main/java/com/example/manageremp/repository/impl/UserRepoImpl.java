package com.example.manageremp.repository.impl;

import com.example.manageremp.entity.User;
import com.example.manageremp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;


@Transactional
@Repository
public class UserRepoImpl implements UserRepo {
    @Autowired
    private EntityManager entityManager;

    @Override
    public User getUserByName(String name) {
        String jql = "select u from User u where u.name = :name";
        return entityManager.createQuery(jql,User.class).setParameter("name",name).getSingleResult();
    }

    @Override
    public void addUser(User group) {

    }

    @Override
    public void deleteUser(String name) {

    }

    @Override
    public void updateUser(User group) {

    }

    @Override
    public User getUser(String name) {
        return null;
    }

    @Override
    public List<User> searchUser(String name, int offset, int maxPerPage) {
        return null;
    }
}
