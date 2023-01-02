package com.example.ieltsprepuz.ielts.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class EssayDTO {

    private Long id;
    private String tile;
    private String description;
    private int wordLimit;
    private int duration;
    private String essay;

    public EssayDTO(String tile, String description, int wordLimit, int duration, String essay) {
        this.tile = tile;
        this.description = description;
        this.wordLimit = wordLimit;
        this.duration = duration;
        this.essay = essay;
    }
}
