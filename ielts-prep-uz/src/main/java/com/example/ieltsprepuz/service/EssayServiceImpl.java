package com.example.ieltsprepuz.service;

import com.example.ieltsprepuz.exception.EssayNotFoundException;
import com.example.ieltsprepuz.converter.EssayConverter;
import com.example.ieltsprepuz.model.EssayDTO;
import com.example.ieltsprepuz.repository.EssayRepository;
import org.springframework.stereotype.Service;

@Service
public class EssayServiceImpl implements EssayService{

    private final EssayRepository essayRepository;

    public EssayServiceImpl(EssayRepository essayRepository) {
        this.essayRepository = essayRepository;
    }

    @Override
    public EssayDTO create(EssayDTO essayDTO) {

        return EssayConverter.toDTO(
                essayRepository.save(EssayConverter.fromDTO(essayDTO))
        );

    }

    @Override
    public void delete(EssayDTO essayDTO) {

        essayRepository.delete(EssayConverter.fromDTO(essayDTO));

    }

    @Override
    public EssayDTO get(Long id) {

        return EssayConverter.toDTO(
                essayRepository.findById(id).orElseThrow(() -> new EssayNotFoundException(id))
        );
    }
}
