package com.example.manageremp.repository;

import com.example.manageremp.entity.Group;
import com.example.manageremp.entity.User;

import java.util.List;

public interface UserRepo {
    User getUserByName(String name);

    void addUser(User group);

    void deleteUser(String name);

    void updateUser(User group);

    User getUser(String name);

    List<User> searchUser(String name, int offset, int maxPerPage);
}
