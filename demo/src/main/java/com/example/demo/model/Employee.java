package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_tbl")
public class Employee {

    @Id
    @GeneratedValue
    @Column (name="Id")
    private int id;
    @Column (name="name")
    public String name;
    @Column (name="team")
    public String team;
}
