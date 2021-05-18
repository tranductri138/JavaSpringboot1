package com.example.manageremp.service.impl;

import com.example.manageremp.model.UserDto;
import com.example.manageremp.repository.UserRepo;
import com.example.manageremp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public void add(UserDto userDto) {

    }

    @Override
    public void update(UserDto userDto) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public UserDto getUser(Long id) {
        return null;
    }

    @Override
    public List<UserDto> searchUser(String name, int offset, int maxPerPage) {
        return null;
    }
}
