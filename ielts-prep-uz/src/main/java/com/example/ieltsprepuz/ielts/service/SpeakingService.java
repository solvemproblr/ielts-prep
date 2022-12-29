package com.example.ieltsprepuz.ielts.service;

import com.example.ieltsprepuz.ielts.model.SpeakingDTO;

public interface SpeakingService {

    SpeakingDTO create(SpeakingDTO speakingDTO);

    void delete(Long id);

    SpeakingDTO get(Long id);

}
