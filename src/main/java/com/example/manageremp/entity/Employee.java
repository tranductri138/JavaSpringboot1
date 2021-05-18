package com.example.manageremp.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
@Setter
@Getter
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String address;
    private int height;

    @ManyToOne
    @JoinColumn(name = "group_nameGruop")
    private Group group;

//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "tableex1")
//    private List<TableExtra1> tableExtra1s;

//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "department")
//    private List<Department> departments;
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "position")
//    private List<Position> positions;

//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private User user;
}
