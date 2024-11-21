package com.student.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
	StudentService studentService;
    @PostMapping
    public Student add(@RequestBody Student student) {
        if (student.getCourses() == null) {
            student.setCourses(new ArrayList<>());  
        }
        return studentService.add(student);
    }

	@GetMapping
	public List<Student> get() {
		return studentService.getAll();
	}
    }

