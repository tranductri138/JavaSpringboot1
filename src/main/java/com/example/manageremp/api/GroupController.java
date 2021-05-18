package com.example.manageremp.api;

import com.example.manageremp.model.GroupDto;
import com.example.manageremp.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @GetMapping("/admin/delete")
    public void deleteGr(@RequestParam(name = "name",required = true)String name){
        groupService.delete(name);
    }
    @PostMapping("/admin/add")
    public void addGroup(@RequestBody GroupDto groupDto){
        groupService.add(groupDto);
    }
    @GetMapping("")
    public GroupDto getGr(@RequestParam(name = "name")String name){
        return groupService.getGroup(name);
    }
    @PostMapping
    public void updateGr(@RequestBody GroupDto groupDto){
         groupService.update(groupDto);
    }
}
