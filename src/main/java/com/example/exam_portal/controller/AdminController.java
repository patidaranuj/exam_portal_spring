package com.example.exam_portal.controller;
import com.example.exam_portal.models.*;
import com.example.exam_portal.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin("*")
public class AdminController {

    @Autowired
    AdminService adminService;
    /*------------------------------------------studnet-------------------------------------*/
    @PostMapping("/admin/addStudent")
    public Student addStudent(@RequestBody Student student){
        return adminService.addStudent(student);
    }

    @GetMapping("/admin/viewStudent")
    public List<Student> viewStudent(){
        return adminService.viewStudent();
    }

    @GetMapping("/admin/viewStudent/{studentId}")
    public Student viewStudentById(@PathVariable String studnetId){
        return adminService.findByEnrollId(studnetId);
    }

    @GetMapping("/admin/viewStudentBySem/{sem}")
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

    /*----------------------------------------Paper----------------------------------------*/
    @GetMapping("/admin/viewpaper")
    public List<Paper> viewPaper()
    {
        return this.adminService.viewPaper();
    }
    @PostMapping("/admin/addpaper")
    public String addPaper(@RequestBody PaperWithoutQues sample)
    //public String addPaper()
    {

        Paper p=new Paper();
        Question q=new Question();
        p.setCourseId(sample.getCourseId());
        p.setName(sample.getName());
        p.setMaxMark(sample.getMaxMark());
        p.setNumOfQues(sample.getNumOfQues());
        List<Options> ol =new ArrayList<>();
        q.setOptions(ol);
       List<Question> ql=new ArrayList<>();
       p.setQuestions(ql);
         this.adminService.addPaper(p);
        return "added";
    }
//        Options op=new Options();
//        List<Question> qli=new ArrayList<>();
//        List<Options> li=new ArrayList<>();
//        op.setOp1("sys");
//        op.setOp2("sts");
//        op.setOp3("sss");
//        op.setOp4("None");
//        op.setAnswer("None");
//        li.add(op);
//        Question q=new Question();
//        q.setDescription("syntax");
//        q.setOptions(li);
//        qli.add(q);
//        Paper p=new Paper();
//        p.setName("MID-SEM");
//        p.setQuestions(qli);
//        this.adminService.addPaper(p);
//        return "added";
//    }

    @DeleteMapping("/admin/deletepaper")
    public void deletePaper(@RequestParam Integer id)
    {
        Paper s=adminService.findByPaperId(id);
        adminService.deletePaper(s);
    }

    /*------------------------------------------Course-------------------------------------*/
    @PostMapping("/admin/addCourse")
    public Course addCourse(@RequestBody Course course){
        return adminService.addCourse(course);
    }

    @GetMapping("/admin/viewCourseByBranch/{branch}")
    public List<Course> viewCourseByBranch(@PathVariable String branch)
    {
        return adminService.viewCourseByBranch(branch);
    }

    @GetMapping("/viewcourse")
    public List<Course> allCourses()
    {
        return adminService.allCourse();
    }


}
