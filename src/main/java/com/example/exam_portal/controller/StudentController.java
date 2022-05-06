package com.example.exam_portal.controller;

import com.example.exam_portal.models.Paper;
import com.example.exam_portal.models.Registration;
import com.example.exam_portal.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    /*-----------------------Registration Controller------------------*/

    @PostMapping("/student/registercourse")
    public void registerCourse(){
        ArrayList<String> courses =new ArrayList();

        courses.add("SB102");
        courses.add("SB106");

        Registration rg= new Registration("101",courses,8);
        studentService.registerCourse(rg);
    }

    /*-----------------------Paper Fetch ------------------*/
    @GetMapping("/student/paper")
    public List<Paper> displayPaper()
    {
        String enrollId="101";
        return studentService.displayPaper(enrollId);
    }


}
