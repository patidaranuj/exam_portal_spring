package com.example.exam_portal.repository;

import com.example.exam_portal.models.Paper;
import com.example.exam_portal.models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface RegistrationRepository extends JpaRepository<Registration, String> {
    Registration findAllByEnrollId(String enrollId);
}
