package com.example.manageremp.repository;

import com.example.manageremp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo {
    void add(Employee emp);
}
