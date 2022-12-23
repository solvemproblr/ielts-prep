package com.example.ieltsprepuz.converter;

import com.example.ieltsprepuz.entity.Speaking;
import com.example.ieltsprepuz.model.SpeakingDTO;

public class SpeakingConverter {

    public static SpeakingDTO toDTO(Speaking speaking) {
        return new SpeakingDTO(speaking.getQuestion(), speaking.getTime());
    }

    public static Speaking fromDTO(SpeakingDTO speakingDTO) {
        return new Speaking(speakingDTO.getQuestion(), speakingDTO.getTime());
    }

}
