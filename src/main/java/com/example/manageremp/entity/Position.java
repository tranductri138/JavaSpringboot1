package com.example.manageremp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Setter
@Entity
@Table(name = "position")
public class Position {
    @Id
    private Long id;
    private String position;
}
