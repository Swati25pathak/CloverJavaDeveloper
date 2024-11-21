package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Courses;
import com.student.service.CourseServices;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	CourseServices courseService;
	
	 @PostMapping
	 public Courses add(@RequestBody Courses courses) {
			return courseService.add(courses);
		}
        @GetMapping
		public List<Courses> getCourses() {
			
			return courseService.getCourses();
		}
}
