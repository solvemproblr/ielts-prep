package com.example.ieltsprepuz.service;

import com.example.ieltsprepuz.model.SpeakingDTO;

public interface SpeakingService {

    SpeakingDTO create(SpeakingDTO speakingDTO);

    void delete(SpeakingDTO speakingDTO);

    SpeakingDTO get(Long id);

}
