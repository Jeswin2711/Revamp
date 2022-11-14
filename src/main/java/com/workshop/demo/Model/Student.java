package com.workshop.demo.Model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
//@Table(name = "Student_DB")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String name;
    private long phoneNumber;
    private String address;

}


//@data , @entity
//datajpa , lombok