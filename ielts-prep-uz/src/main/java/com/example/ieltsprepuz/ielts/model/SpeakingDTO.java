package com.example.ieltsprepuz.ielts.model;

public class SpeakingDTO {

    private String question;
    private Long time;

    public SpeakingDTO(String question, Long time) {
        this.question = question;
        this.time = time;
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
