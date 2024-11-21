package com.student.service;

import java.util.List;
import com.student.entity.Student;

public interface StudentService {
	  Student add(Student student);
	 List<Student> getAll();

}
