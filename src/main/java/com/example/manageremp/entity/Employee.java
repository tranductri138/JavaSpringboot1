package com.example.manageremp.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
@Setter
@Getter
public class Employee {

    @Id
    private String name;
    private int age;
    private String address;
    private int height;
}
