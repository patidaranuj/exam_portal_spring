package com.example.exam_portal.repository;

import com.example.exam_portal.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,String> {


//    void delete(Optional<Student> s);

    List<Student> findAllBySem(int sem);


    Student findByEnrollId(String id);
}
