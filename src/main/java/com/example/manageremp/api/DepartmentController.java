package com.example.manageremp.api;

import com.example.manageremp.model.DepartmentDto;
import com.example.manageremp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;


    @GetMapping("/admin/delete")
    public void deleteGr(@RequestParam(name = "name", required = true) String name) {
        departmentService.delete(name);
    }

    @PostMapping("/admin/add")
    public void addGroup(@RequestBody DepartmentDto departmentDto) {
        departmentService.add(departmentDto);
    }

    @GetMapping("/member/get")
    public DepartmentDto getGr(@RequestParam(name = "name") String name) {
        return departmentService.getDepartment(name);
    }

    @PostMapping("/admin/update")
    public void updateGr(@RequestBody DepartmentDto departmentDto) {
        departmentService.update(departmentDto);
    }
}
