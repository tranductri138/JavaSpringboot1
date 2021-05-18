package com.example.manageremp.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "group")
@Setter
public class Group {
    @Id
    private String nameGruop;
    private int numberOfGr;

    @OneToMany(mappedBy = "group",cascade = CascadeType.ALL)
    private List<Employee> employeeList;
}
