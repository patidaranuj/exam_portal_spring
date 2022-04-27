package com.example.exam_portal.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;



    private String enrollId;
    private String name;
    private String branch;
    private int sem;
    private String email;
    private String password;
    private String course;
    private String role="STUDENT";

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(String enrollId) {
        this.enrollId = enrollId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Student() {
    }

    public Student(int sid,String enrollId, String name, String branch, int sem, String email, String password, String course, String role) {
        this.sid=sid;
        this.enrollId = enrollId;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
        this.email = email;
        this.password = password;
        this.course = course;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", enrollId='" + enrollId + '\'' +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", sem=" + sem +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", course='" + course + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
