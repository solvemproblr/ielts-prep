package com.example.ieltsprepuz.ielts.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
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
}
