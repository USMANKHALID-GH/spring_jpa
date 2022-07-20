package com.example.simple.jpa.repository;

import com.example.simple.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface StudentRepository  extends JpaRepository<Student, Long> {

}
