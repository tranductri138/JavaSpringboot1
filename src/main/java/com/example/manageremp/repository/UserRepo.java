package com.example.manageremp.repository;

import com.example.manageremp.entity.User;

public interface UserRepo {
    User getUserByName(String name);
}
