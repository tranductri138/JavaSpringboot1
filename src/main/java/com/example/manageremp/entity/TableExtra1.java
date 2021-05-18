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
@Table(name = "tableex1")
public class TableExtra1 {

    @Id
    private Long tableId;
    private String roomName;
    private Long id ;
    @OneToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Employee employee;

    @OneToOne
    @JoinColumn(name = "roomName" , insertable = false, updatable = false)
    private Department department;

}
