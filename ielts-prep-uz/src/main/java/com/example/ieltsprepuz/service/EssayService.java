package com.example.ieltsprepuz.service;

import com.example.ieltsprepuz.entity.Essay;
import com.example.ieltsprepuz.model.EssayDTO;

public interface EssayService {

    EssayDTO create(EssayDTO essayDTO);
    void delete(EssayDTO essayDTO);
    EssayDTO get(Long id);

}
