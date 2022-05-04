package com.sofka.courses.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name="Course=")
@Table(name="course")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String semester;
    private String description;

    @OneToMany( cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private List<Student> students=new ArrayList<>();

    public Course addStudent(Student student){
        this.students.add(student);
        return this;
    }
}
