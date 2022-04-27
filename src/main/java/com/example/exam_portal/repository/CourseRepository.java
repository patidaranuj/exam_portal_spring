package com.example.exam_portal.repository;

import com.example.exam_portal.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,String> {

    List<Course> findAllByBranch(String branch);
}
