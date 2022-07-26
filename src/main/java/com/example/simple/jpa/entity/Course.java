package com.example.simple.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {
@Id
@SequenceGenerator(name = "course_sequence",sequenceName = "course_sequence",allocationSize = 1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_sequence")
private  Long courseId;
private String courseName;
private Integer credit;

@ManyToMany(

     cascade = CascadeType.ALL
)
@JoinTable(
        name = "student_course_map",
        joinColumns = @JoinColumn(name = "course_id",referencedColumnName = "courseId"),
        inverseJoinColumns = @JoinColumn(name = "id",referencedColumnName = "id")
)
private List<Student> studentList;
}
