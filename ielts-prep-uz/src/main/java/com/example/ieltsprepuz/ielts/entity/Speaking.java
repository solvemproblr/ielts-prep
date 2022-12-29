package com.example.ieltsprepuz.ielts.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
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
}

