package com.student.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "student_course", 
        joinColumns = @JoinColumn(name = "student_id"), 
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Courses> cr = new ArrayList<>();
	public Student(Long studentId, String name, List<Courses> cr) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.cr = cr;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", courses=" + cr + "]";
	}


	public Long getstudentId() {
        return studentId;
    }

    public void setstudentId(Long studentId) {
        this.studentId =studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Courses> getCourses() {
        return cr;
    }

    public void setCourses(List<Courses> courses) {
        this.cr = courses;
    }
    
}


