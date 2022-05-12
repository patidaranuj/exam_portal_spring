package com.example.exam_portal.models;



import javax.persistence.*;
import java.util.List;

@Entity
public class Paper
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    private String name;
    private String courseId;
    private int numOfQues;
    private int maxMark;
    //@OneToMany(mappedBy = "paper",cascade = CascadeType.ALL)
    @OneToMany(targetEntity = Question.class,cascade = CascadeType.ALL)
    private List<Question> questions;

    public int getNumOfQues() {
        return numOfQues;
    }

    public void setNumOfQues(int numOfQues) {
        this.numOfQues = numOfQues;
    }

    public int getMaxMark() {
        return maxMark;
    }

    public void setMaxMark(int maxMark) {
        this.maxMark = maxMark;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }



    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Paper() {
    }


}
