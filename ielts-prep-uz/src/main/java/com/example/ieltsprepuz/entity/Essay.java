package com.example.ieltsprepuz.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "essay")
public class Essay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    String title;
    String description;
    int wordLimit;
    int duration;
    String essay;

    public Essay(String title, String description, int wordLimit, int duration, String essay) {
        this.title = title;
        this.description = description;
        this.wordLimit = wordLimit;
        this.duration = duration;
        this.essay = essay;
    }

    public Essay() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWordLimit() {
        return wordLimit;
    }

    public void setWordLimit(int wordLimit) {
        this.wordLimit = wordLimit;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getEssay() {
        return essay;
    }

    public void setEssay(String essay) {
        this.essay = essay;
    }
}
