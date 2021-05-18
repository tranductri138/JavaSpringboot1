package com.example.manageremp.repository;

import com.example.manageremp.entity.User;

import java.util.List;

public interface UserRepo {
    User getUserByName(String name);

    void addUser(User user);

    void deleteUser(Long id);

    void updateUser(User userl);

    User getUser(Long id);

    List<User> searchUser(String name, int offset, int maxPerPage);
}
