package com.example.simple.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseMaterial {
    @Id
    @SequenceGenerator(name = "course_material_sequence",sequenceName = "course_material_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_material_sequence")
    private Long courseMaterialId;
    @Column(nullable = false)
    private String Url;


    @OneToOne
    @JoinColumn(name = "course_id",referencedColumnName = "courseId", nullable = false)
    private Course course;
}
