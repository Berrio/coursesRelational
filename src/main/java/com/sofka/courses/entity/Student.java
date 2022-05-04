package com.sofka.courses.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name="Student")
@Table(name="student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String Career;
    private Long fkCourseId;


}
