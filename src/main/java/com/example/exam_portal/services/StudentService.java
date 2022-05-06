package com.example.exam_portal.services;

import com.example.exam_portal.models.Paper;
import com.example.exam_portal.models.Registration;
import com.example.exam_portal.repository.PaperRepository;
import com.example.exam_portal.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    RegistrationRepository registrationRepository;

    @Autowired
    PaperRepository paperRepository;


    public void registerCourse(Registration rg)
    {
        registrationRepository.save(rg);
    }

    public List<Paper> displayPaper(String enrollId) {
        Registration res= registrationRepository.findAllByEnrollId(enrollId);
        List<String> enrolledCourses = res.getCourseId();
       // return paperRepository.findAllByCourseId(enrolledCourses);
        List<Paper> paperList =new ArrayList<>();
        for(String course:enrolledCourses)
        {
            paperList.add(paperRepository.findAllByCourseId(course));
        }
        return paperList;
    }
}
