package com.example.ieltsprepuz.service;

import com.example.ieltsprepuz.exception.EssayNotFoundException;
import com.example.ieltsprepuz.model.EssayDTO;
import com.example.ieltsprepuz.repository.EssayRepository;
import org.springframework.stereotype.Service;

import static com.example.ieltsprepuz.converter.EssayConverter.fromDTO;
import static com.example.ieltsprepuz.converter.EssayConverter.toDTO;

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
