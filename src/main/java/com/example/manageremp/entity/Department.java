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
@Getter
@Setter
@Table(name = "department")
public class Department {
    @Id
    private String roomName;
    private String mission;


//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "tableex1")
//    private List<TableExtra1> tableExtra1s;
}
