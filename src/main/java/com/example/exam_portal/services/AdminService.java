package com.example.exam_portal.services;

import com.example.exam_portal.models.Course;
import com.example.exam_portal.models.Paper;
import com.example.exam_portal.models.Student;
import com.example.exam_portal.repository.AdminRepository;
import com.example.exam_portal.repository.CourseRepository;
import com.example.exam_portal.repository.PaperRepository;
import com.example.exam_portal.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    PaperRepository paperRepository;

    @Autowired
    CourseRepository courseRepository;

    public Student addStudent(Student stud){
        return this.studentRepository.save(stud);
    }
    public List<Student> viewStudent()
    {
        return studentRepository.findAll();
    }

    public void delete(Student s)
    {
        studentRepository.delete(s);
    }

    public Course addCourse(Course course){
        return this.courseRepository.save(course);
    }

    /*public Optional<Student> findbyId(String id) {
        return studentRepository.findById(id);
    }*/

    public Student findByEnrollId(String id)
    {
        return studentRepository.findByEnrollId(id);
    }


    public List<Student> viewAllStudentBySem(int sem) {

        return studentRepository.findAllBySem(sem);
    }

    public List<Course> viewCourseByBranch(String branch) {
        return courseRepository.findAllByBranch(branch);
    }


    public void addPaper(Paper paper)
    {
        this.paperRepository.save(paper);
    }

    public List<Course> allCourse() {
        return courseRepository.findAll();
    }

    public List<Paper> viewPaper() {
        return paperRepository.findAll();
    }

    public Paper findByPaperId(int id) {
        return paperRepository.findByPid(id);
    }

    public void deletePaper(Paper s) {
        paperRepository.delete(s);
    }
}
