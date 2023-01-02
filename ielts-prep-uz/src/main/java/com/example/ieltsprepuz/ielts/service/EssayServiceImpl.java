package com.example.ieltsprepuz.ielts.service;

import com.example.ieltsprepuz.ielts.exception.EssayNotFoundException;
import com.example.ieltsprepuz.ielts.model.EssayDTO;
import com.example.ieltsprepuz.ielts.repository.EssayRepository;
import org.springframework.stereotype.Service;

import static com.example.ieltsprepuz.ielts.converter.EssayConverter.fromDTO;
import static com.example.ieltsprepuz.ielts.converter.EssayConverter.toDTO;

@Service
public class EssayServiceImpl implements EssayService {

    private final EssayRepository essayRepository;

    public EssayServiceImpl(EssayRepository essayRepository) {
        this.essayRepository = essayRepository;
    }

    @Override
    public EssayDTO create(EssayDTO essayDTO) {

        return toDTO(
                essayRepository.save(fromDTO(essayDTO))
        );

    }

    @Override
    public void delete(EssayDTO essayDTO) {

        essayRepository.delete(fromDTO(essayDTO));

    }

    @Override
    public EssayDTO get(Long id) {

        return toDTO(
                essayRepository.findById(id).orElseThrow(() -> new EssayNotFoundException(id))
        );
    }
}
