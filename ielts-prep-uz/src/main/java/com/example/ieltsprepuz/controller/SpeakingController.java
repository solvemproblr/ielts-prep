package com.example.ieltsprepuz.controller;

import com.example.ieltsprepuz.model.SpeakingDTO;
import com.example.ieltsprepuz.service.SpeakingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/speaking")
public class SpeakingController {

    private final SpeakingService speakingService;

    public SpeakingController(SpeakingService speakingService) {
        this.speakingService = speakingService;
    }

    @GetMapping("{/id}")
    public SpeakingDTO getById(@PathVariable Long id) {
        return speakingService.get(id);
    }

    @PostMapping("{/create}")
    public SpeakingDTO create(SpeakingDTO speakingDTO) {
        return speakingService.create(speakingDTO);
    }

    @DeleteMapping("/delete")
    public void delete(Long id) {
        speakingService.delete(id);
    }
}
