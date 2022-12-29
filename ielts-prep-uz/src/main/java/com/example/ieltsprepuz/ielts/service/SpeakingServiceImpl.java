package com.example.ieltsprepuz.ielts.service;

import com.example.ieltsprepuz.ielts.exception.SpeakingNotFoundException;
import com.example.ieltsprepuz.ielts.model.SpeakingDTO;
import com.example.ieltsprepuz.ielts.repository.SpeakingRepository;
import org.springframework.stereotype.Service;

import static com.example.ieltsprepuz.ielts.converter.SpeakingConverter.fromDTO;
import static com.example.ieltsprepuz.ielts.converter.SpeakingConverter.toDTO;

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
    public void delete(Long id) {
        speakingRepository.deleteById(id);
    }

    @Override
    public SpeakingDTO get(Long id) {
        return toDTO(speakingRepository.findById(id).orElseThrow(() -> new SpeakingNotFoundException(id)));
    }
}
