package com.example.ieltsprepuz.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "speaking")
public class Speaking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String question;
    private Long time;

    public Speaking(String question, Long time) {
        this.question = question;
        this.time = time;
    }

    public Speaking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}

