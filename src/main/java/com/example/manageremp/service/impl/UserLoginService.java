package com.example.manageremp.service.impl;

import com.example.manageremp.entity.User;
import com.example.manageremp.model.UserPrinciple;
import com.example.manageremp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserLoginService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = userRepo.getUserByName(name);
        if (user == null) {
            throw new UsernameNotFoundException("not found");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (String role : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        UserPrinciple userPrinciple = new UserPrinciple(user.getName(), user.getPassword(), user.getEnabled()
                , true, true, true, authorities);
        userPrinciple.setId(user.getId());
        userPrinciple.setName(user.getName());
        userPrinciple.setRoles(user.getRoles());
        return userPrinciple;
    }
}
