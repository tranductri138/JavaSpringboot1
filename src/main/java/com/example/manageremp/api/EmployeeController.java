package com.example.manageremp.api;


import com.example.manageremp.model.EmployeeDto;
import com.example.manageremp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/tridepzai")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public void addEmployee(@RequestBody EmployeeDto employeeDto){
        employeeService.add(employeeDto);
    }
}
