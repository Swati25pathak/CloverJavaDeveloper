package com.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.entity.Courses;
import com.student.entity.Student;
import com.student.repository.CoursesRepository;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CoursesRepository coursesRepository;

    @Override
    public Student add(Student student) {
      
        if (student.getCourses() == null) {
            student.setCourses(new ArrayList<>());
        }

      
        if (!student.getCourses().isEmpty()) {
            List<Long> courseIds = student.getCourses().stream()
                                          .map(Courses::getcourseId) 
                                          .collect(Collectors.toList());
            List<Courses> courses = coursesRepository.findAllById(courseIds);
            
            student.setCourses(courses);
        }
        return studentRepository.save(student);
    }


    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}


