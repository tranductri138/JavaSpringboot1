package com.example.manageremp.service;

import com.example.manageremp.model.GroupDto;

import java.util.List;

public interface GroupService {
    void add(GroupDto groupDto);

    void update(GroupDto groupDto);

    void delete(String name);

    GroupDto getGroup(String name);

    List<GroupDto> searchUser(String name, int offset, int maxPerPage);
}
