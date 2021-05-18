package com.example.manageremp.api;

import com.example.manageremp.entity.User;
import com.example.manageremp.model.EmployeeDto;
import com.example.manageremp.model.UserDto;
import com.example.manageremp.service.EmployeeService;
import com.example.manageremp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/admin/add")
    public void addUser(@RequestBody UserDto userDto) {
        userService.add(userDto);
    }

    @GetMapping("/admin/delete")
    public void deleteUser(@RequestParam(name = "id", required = true) Long id) {
        userService.delete(id);
    }

//    @GetMapping("/admin/search")
//    public List<User> employeeDtos(@RequestParam(name = "keyword", required = false) String keyword,
//                                   @RequestParam(name = "page", required = false) Integer page) {
//        page = page == null ? 1 : page;
//        keyword = keyword == null ? "" : keyword;
//        List<UserDto> userDtos = UserService.searchEmp(keyword, 0, page * 10);
//        return userDtos;
//    }

    @GetMapping("/admin/get")
    public UserDto getUserDto(@RequestParam(name = "id", required = true) Long id) {
        return userService.getUser(id);
    }
    @PostMapping("/admin/update")
    public void updateEmp(@RequestBody UserDto userDto){
        userService.update(userDto);
    }
}
