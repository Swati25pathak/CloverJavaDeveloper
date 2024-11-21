package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.student.entity.Courses;
@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long>{

}
