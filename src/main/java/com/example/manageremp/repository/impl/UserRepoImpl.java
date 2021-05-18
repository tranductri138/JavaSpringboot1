package com.example.manageremp.repository.impl;

import com.example.manageremp.entity.User;
import com.example.manageremp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


@Transactional
@Repository
public class UserRepoImpl implements UserRepo {
    @Autowired
    private EntityManager entityManager;

    @Override
    public User getUserByName(String name) {
        String jql = "select u from User u where u.name = :name";
        return entityManager.createQuery(jql, User.class).setParameter("name", name).getSingleResult();
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(Long id) {
        entityManager.remove(getUser(id));
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getUser(Long id  ) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> searchUser(String name, int offset, int maxPerPage) {
        String jql = "select u from User u where u.name like :name";
        Query query = entityManager.createQuery(jql,User.class);
        query.setParameter("name","%"+name+"%");
        query.setFirstResult(offset).setMaxResults(maxPerPage);
        return query.getResultList();
    }
}
