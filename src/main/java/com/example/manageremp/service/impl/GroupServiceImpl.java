package com.example.manageremp.service.impl;

import com.example.manageremp.entity.Group;
import com.example.manageremp.model.GroupDto;
import com.example.manageremp.repository.GroupRepo;
import com.example.manageremp.service.GroupService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepo groupRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void add(GroupDto groupDto) {
        groupRepo.addGroup(convert(groupDto));
    }

    @Override
    public void update(GroupDto groupDto) {
        groupRepo.updateGroup(convert(groupDto));
    }

    @Override
    public void delete(String name) {
        groupRepo.deleteGroup(name);
    }

    @Override
    public GroupDto getGroup(String name) {
        Group group = groupRepo.getGroup(name);
        return convert2(group);
    }

    @Override
    public List<GroupDto> searchUser(String name, int offset, int maxPerPage) {
        return null;
    }

    private Group convert(GroupDto groupDto) {
        Group gruop = mapper.map(groupDto, Group.class);
        return gruop;
    }

    private GroupDto convert2(Group group) {
        GroupDto groupDto = mapper.map(group, GroupDto.class);
        return groupDto;
    }
}
