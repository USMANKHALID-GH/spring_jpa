package com.example.simple.jpa.repository;

import com.example.simple.jpa.entity.Gardian;
import com.example.simple.jpa.entity.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

 @Autowired
 private StudentRepository studentRepository;
 @Test
public  void saveStudent(){
  Gardian gardian= Gardian.builder().email("12345@mgil").name("123666").number("1223444").build();
 Student student=Student.builder().Tc("1234567907").sName("usman").fName("khalid").age(24)
                 .gardian(gardian).
         build();
 studentRepository.save(student);


}

@Test
 public  void Paging(){
 Pageable pageable= PageRequest.of(0,3);
}

}