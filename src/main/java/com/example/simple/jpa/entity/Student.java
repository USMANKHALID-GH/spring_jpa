package com.example.simple.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "_Student_table")
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence",sequenceName = "student_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
    private  Long id;
    private  String fName;
    private String sName;
    private int age;
    @Column(name="TC_KIMLIK",nullable = false,length = 11,unique = true)
    private  String Tc;

//    private String gardianName;
//    private String gardianEmail;
//    private  String gardianNumber;

    @Embedded
    private Gardian gardian;



}
