package com.sofka.courses.controller;

import com.sofka.courses.entity.Course;
import com.sofka.courses.entity.Student;
import com.sofka.courses.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class Controller {

    @Autowired
    private CourseService service;

    @GetMapping("get/courses")
    public List<Course> getAllCourses() {
        return service.getCourses();
    }

    @PostMapping("create/course")
    public Course createCourse(@RequestBody Course course) {
        return service.CreateCourse(course);
    }

    @PostMapping("create/student")
    public Course createStudent(@RequestBody Student student) {
        return service.CreateStudent(student);
    }

    @DeleteMapping("delete/course")
    public void deleteCourse(@RequestBody Course course) {
        service.deleteCourse(course);
    }

    @DeleteMapping("delete/student")
    public void deletestudent(@RequestBody Student student) {
        service.deleteStudent(student);
    }
}
