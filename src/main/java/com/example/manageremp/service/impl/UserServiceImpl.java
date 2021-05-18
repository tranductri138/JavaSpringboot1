package com.example.manageremp.service.impl;

import com.example.manageremp.entity.User;
import com.example.manageremp.model.UserDto;
import com.example.manageremp.repository.UserRepo;
import com.example.manageremp.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void add(UserDto userDto) {
        User user = mapper.map(userDto,User.class);
        userRepo.addUser(user);
    }

    @Override
    public void update(UserDto userDto) {
        User user = userRepo.getUser(userDto.getId());
        if (user!= null){
            user = mapper.map(userDto,User.class);
            userRepo.updateUser(user);
        }
    }

    @Override
    public void delete(Long id) {
        User user = userRepo.getUser(id);
        if (user!= null){
            userRepo.deleteUser(id);
        }
    }

    @Override
    public UserDto getUser(Long id) {
        User user = userRepo.getUser(id);
        return convert(user);
    }

    @Override
    public List<UserDto> searchUser(String name, int offset, int maxPerPage) {
        return null;
    }
    private UserDto convert(User user){
        UserDto userDto = mapper.map(user,UserDto.class);
        return userDto;
    }
}
