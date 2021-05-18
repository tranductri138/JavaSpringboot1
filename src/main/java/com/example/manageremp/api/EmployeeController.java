package com.example.manageremp.api;


import com.example.manageremp.model.EmployeeDto;
import com.example.manageremp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/admin/add")
    public void addEmployee(@RequestBody EmployeeDto employeeDto) {
        employeeService.add(employeeDto);
    }

    @GetMapping("/admin/delete")
    public void deleteEmp(@RequestParam(name = "id", required = true) Long id) {
        employeeService.delete(id);
    }

    @GetMapping("/member/search")
    public List<EmployeeDto> employeeDtos(@RequestParam(name = "keyword", required = false) String keyword,
                                          @RequestParam(name = "page", required = false) Integer page) {
        page = page == null ? 1 : page;
        keyword = keyword == null ? "" : keyword;
        List<EmployeeDto> listEmp = employeeService.searchEmp(keyword, 0, page * 10);
        return listEmp;
    }

    @GetMapping("/admin/get")
    public EmployeeDto employeeDto(@RequestParam(name = "id", required = true) Long id) {
        return employeeService.getEmp(id);
    }
    @PostMapping("/admin/update")
    public void updateEmp(@RequestBody EmployeeDto employeeDto){
        employeeService.update(employeeDto);
    }
}
