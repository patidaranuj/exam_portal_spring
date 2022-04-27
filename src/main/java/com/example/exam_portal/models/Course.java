package com.example.exam_portal.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String courseId;
    private String courseName;
    private String branch;

    public Course() {
    }

    public Course(int cid,String courseId, String courseName, String branch) {
        this.cid=cid;
        this.courseId = courseId;
        this.courseName = courseName;
        this.branch = branch;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
