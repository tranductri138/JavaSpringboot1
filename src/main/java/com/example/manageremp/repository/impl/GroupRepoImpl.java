package com.example.manageremp.repository.impl;

import com.example.manageremp.entity.Group;
import com.example.manageremp.repository.GroupRepo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class GroupRepoImpl implements GroupRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addGroup(Group group) {
        entityManager.persist(group);
    }

    @Override
    public void deleteGroup(String name) {
        entityManager.remove(getGroup(name));
    }

    @Override
    public void updateGroup(Group group) {
        entityManager.merge(group);
    }

    @Override
    public Group getGroup(String name) {
        return entityManager.find(Group.class,name);
    }

    @Override
    public List<Group> searchGr(String name, int offset, int maxPerPage) {
        return null;
    }
}
