package com.student.service;

import java.util.List;

import com.student.entity.Courses;

public interface CourseServices {

	Courses add(Courses courses);
	List<Courses> getCourses();
}
