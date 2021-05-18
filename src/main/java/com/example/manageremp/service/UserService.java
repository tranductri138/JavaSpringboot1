package com.example.manageremp.service;

import com.example.manageremp.model.EmployeeDto;
import com.example.manageremp.model.UserDto;

import java.util.List;

public interface UserService {
    void add(UserDto userDto);

    void update(UserDto userDto);
    void delete(Long id);
    UserDto getUser(Long id);

    List<UserDto> searchUser(String name, int offset, int maxPerPage);
}
