package com.example.ieltsprepuz.ielts.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SpeakingDTO {

    private Long id;
    private String question;
    private Long time;

    public SpeakingDTO(String question, Long time) {
        this.question = question;
        this.time = time;
    }
}
