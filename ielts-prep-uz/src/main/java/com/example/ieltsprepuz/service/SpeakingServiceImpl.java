package com.example.ieltsprepuz.service;

import com.example.ieltsprepuz.exception.SpeakingNotFoundException;
import com.example.ieltsprepuz.model.SpeakingDTO;
import com.example.ieltsprepuz.repository.SpeakingRepository;
import org.springframework.stereotype.Service;

import static com.example.ieltsprepuz.converter.SpeakingConverter.fromDTO;
import static com.example.ieltsprepuz.converter.SpeakingConverter.toDTO;

@Service
public class SpeakingServiceImpl implements SpeakingService {

    private final SpeakingRepository speakingRepository;

    public SpeakingServiceImpl(SpeakingRepository speakingRepository) {
        this.speakingRepository = speakingRepository;
    }

    @Override
    public SpeakingDTO create(SpeakingDTO speakingDTO) {
        return toDTO(speakingRepository.save(fromDTO(speakingDTO)));
    }

    @Override
    public void delete(SpeakingDTO speakingDTO) {
        speakingRepository.delete(fromDTO(speakingDTO));
    }

    @Override
    public SpeakingDTO get(Long id) {
        return toDTO(speakingRepository.findById(id).orElseThrow(() -> new SpeakingNotFoundException(id)));
    }
}