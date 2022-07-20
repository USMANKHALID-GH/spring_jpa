package com.example.simple.jpa.repository;

import com.example.simple.jpa.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {
   public Course save(Course course);
}
