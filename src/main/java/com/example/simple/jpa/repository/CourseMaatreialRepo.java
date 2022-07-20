package com.example.simple.jpa.repository;

import com.example.simple.jpa.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaatreialRepo extends JpaRepository<CourseMaterial, Long> {
    public  CourseMaterial save( CourseMaterial courseMaterial);
}
