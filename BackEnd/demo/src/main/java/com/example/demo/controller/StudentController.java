package com.examly.springapp.controller;

import com.examly.springapp.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping
    public Student getStudent() {
        // Ensure that the student object has the specified values assigned
        Student student = new Student(1L, "John Doe", "This is a student description");
        return student;
    }
}