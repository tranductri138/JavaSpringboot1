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
@Table(name = "group")
@Setter
public class Group {
    @Id
    private String nameGruop;
    private int numberOfGr;

    @ManyToOne
    @JoinColumn(name = "employee")
    private Employee employee;
}
