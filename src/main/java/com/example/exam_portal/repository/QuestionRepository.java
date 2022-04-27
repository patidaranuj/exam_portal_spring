package com.example.exam_portal.repository;

import com.example.exam_portal.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Integer>
{
}
