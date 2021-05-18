package com.example.manageremp.repository;

import com.example.manageremp.entity.Employee;
import com.example.manageremp.entity.Group;

import java.util.List;

public interface GroupRepo {
    void addGroup(Group group);

    void deleteGroup(String name);

    void updateGroup(Group group);

    Group getGroup(String name);

    List<Group> searchGr(String name, int offset, int maxPerPage);
}
