package com.example.manageremp.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "department")
public class Department {
    @Id
    private String roomName;
    private String mission;

    @ManyToOne
    @JoinColumn(name = "employee")
    private Employee employee;
}
