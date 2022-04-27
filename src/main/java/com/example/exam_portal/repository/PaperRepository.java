package com.example.exam_portal.repository;

import com.example.exam_portal.models.Paper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaperRepository extends JpaRepository<Paper,Integer> {
}
