package com.sofka.courses.service;

import com.sofka.courses.entity.Course;
import com.sofka.courses.entity.Student;
import com.sofka.courses.repository.CourseRepository;
import com.sofka.courses.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImplementation implements CourseService{

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course CreateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course CreateStudent(Student student) {
        Course course=courseRepository.findById(student.getFkCourseId()).get();
        course.addStudent(student);
        studentRepository.save(student);
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Course course) {
        courseRepository.deleteById(course.getId());
    }

    @Override
    public void deleteStudent(Student student) {
        studentRepository.deleteById(student.getId());
    }
}
