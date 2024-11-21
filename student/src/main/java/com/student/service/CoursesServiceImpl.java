package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Courses;
import com.student.repository.CoursesRepository;
@Service
public class CoursesServiceImpl implements CourseServices {
	@Autowired
    CoursesRepository courseRepository;
	@Override
	public Courses add(Courses courses) {
		
		return courseRepository.save(courses);
	}

	@Override
	public List<Courses> getCourses() {
		
		return courseRepository.findAll();
	}

}
