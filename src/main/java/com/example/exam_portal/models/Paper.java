package com.example.exam_portal.models;



import javax.persistence.*;
import java.util.List;

@Entity
public class Paper
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pid")
    private int pid;
    private String name;
    //@OneToMany(mappedBy = "paper",cascade = CascadeType.ALL)
    @OneToMany(targetEntity = Question.class,cascade = CascadeType.ALL)
    private List<Question> questions;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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

    public Paper(int pid, String name, List<Question> questions) {
        this.pid = pid;
        this.name = name;
        this.questions = questions;
    }
}
