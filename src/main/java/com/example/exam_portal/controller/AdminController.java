package com.example.exam_portal.controller;

import com.example.exam_portal.models.Course;
import com.example.exam_portal.models.Student;
import com.example.exam_portal.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

/*------------------------------------------studnet-------------------------------------*/
    @PostMapping("/admin/addStudent")
    public Student addStudent(@RequestBody Student student){
        return adminService.addStudent(student);
    }

    @PostMapping("/admin/viewStudent")
    public List<Student> viewStudent(){
        return adminService.viewStudent();
    }

    @PostMapping("/admin/viewStudent/{studentId}")
    public Student viewStudentById(@PathVariable String studnetId){
        return adminService.findByEnrollId(studnetId);
    }
    @PostMapping("/admin/viewStudentBySem/{sem}")
    public List<Student> viewStudentBySem(@PathVariable int sem)
    {
        return adminService.viewAllStudentBySem(sem);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String delete(@RequestParam String id)
    {
        Student s=adminService.findByEnrollId(id);
        if(s!=null)
        {
            adminService.delete(s);
            return "Deleted";
        }
        return "error";
    }



    /*------------------------------------------Course-------------------------------------*/




    @PostMapping("/admin/addCourse")
    public Course addCourse(@RequestBody Course course){
        return adminService.addCourse(course);
    }

    @PostMapping("/admin/viewCourseByBranch/{branch}")
    public List<Course> viewCourseByBranch(@PathVariable String branch)
    {
        return adminService.viewCourseByBranch(branch);
    }


}
