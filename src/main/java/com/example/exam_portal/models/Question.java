package com.example.exam_portal.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="qid")
    private int qid;
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paper_pid", referencedColumnName = "pid")
    private Paper paper;
    //@OneToMany(mappedBy = "question",cascade = CascadeType.ALL)
    @OneToMany(targetEntity = Options.class,cascade = CascadeType.ALL)
    private List<Options> options;

    public Question() {
    }

    public Question(int qid, String description, List<Options> options) {
        this.qid = qid;
        this.description = description;
        this.options = options;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(List<Options> options) {
        this.options = options;
    }
}
