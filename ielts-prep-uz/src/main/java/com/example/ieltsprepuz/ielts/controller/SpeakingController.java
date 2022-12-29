package com.example.ieltsprepuz.ielts.controller;

import com.example.ieltsprepuz.ielts.model.SpeakingDTO;
import com.example.ieltsprepuz.ielts.service.SpeakingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/speaking")
public class SpeakingController {

    private final SpeakingService speakingService;

    public SpeakingController(SpeakingService speakingService) {
        this.speakingService = speakingService;
    }

    @GetMapping("/{id}")
    public SpeakingDTO getById(@PathVariable Long id) {
        return speakingService.get(id);
    }

    @PostMapping("/create")
    public SpeakingDTO create(@RequestBody SpeakingDTO speakingDTO) {
        return speakingService.create(speakingDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        speakingService.delete(id);
    }
}
