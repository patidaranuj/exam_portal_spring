package com.example.exam_portal.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Registration {

    @Id
    private String enrollId;
    private ArrayList<String> courseId;
    private int sem;

    public Registration() {
    }

    public Registration(String enrollId, ArrayList<String> courseId, int sem) {
        this.enrollId = enrollId;
        this.courseId = courseId;
        this.sem = sem;
    }

    public String getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(String enrollId) {
        this.enrollId = enrollId;
    }

    public ArrayList<String> getCourseId() {
        return courseId;
    }

    public void setCourseId(ArrayList<String> courseId) {
        this.courseId = courseId;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "enrollId='" + enrollId + '\'' +
                ", courseId=" + courseId +
                ", sem='" + sem + '\'' +
                '}';
    }
}
