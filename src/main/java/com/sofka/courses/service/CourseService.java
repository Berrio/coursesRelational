package com.sofka.courses.service;

import com.sofka.courses.entity.Course;
import com.sofka.courses.entity.Student;

import java.util.List;

public interface CourseService {

     List<Course> getCourses();
     Course CreateCourse(Course course);
     Course CreateStudent(Student student);
     void deleteCourse(Course course);
     void deleteStudent(Student student);
}
