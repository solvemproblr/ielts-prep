package com.example.ieltsprepuz.ielts.service;

import com.example.ieltsprepuz.ielts.model.EssayDTO;

public interface EssayService {

    EssayDTO create(EssayDTO essayDTO);
    void delete(EssayDTO essayDTO);
    EssayDTO get(Long id);

}
