package com.student.entity;



import java.util.ArrayList;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToMany;


@Entity
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseName;
    
    @ManyToMany(mappedBy = "cr")
    @JsonBackReference
    private List<Student> students = new ArrayList<>();
    
	public Long getcourseId() {
		return courseId;
	}

	public void setcourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Courses(Long courseId, String courseName, List<Student> students) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.students = students;
	}

	public Courses() {
		super();
	}

	@Override
	public String toString() {
		return "Courses courseId=" + courseId + ", courseName=" + courseName + ", students=" + students + "]";
	}
    

}
	
