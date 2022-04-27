package com.example.exam_portal.models;

import javax.persistence.*;

@Entity
public class Options
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String op1;
    private String op2;
    private String op3;
    private String op4;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_qid", referencedColumnName = "qid")
    private Question question;
    private String answer;

    public Options() {

    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Options(String op1, String op2, String op3, String op4, String answer) {
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.answer = answer;
    }
}
