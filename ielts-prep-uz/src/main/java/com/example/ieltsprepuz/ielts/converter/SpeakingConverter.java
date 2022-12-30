package com.example.ieltsprepuz.ielts.converter;

import com.example.ieltsprepuz.ielts.entity.Speaking;
import com.example.ieltsprepuz.ielts.model.SpeakingDTO;

public class SpeakingConverter {

    public static SpeakingDTO toDTO(Speaking speaking) {
        return new SpeakingDTO(speaking.getId(), speaking.getQuestion(), speaking.getTime());
    }

    public static Speaking fromDTO(SpeakingDTO speakingDTO) {
        return new Speaking(speakingDTO.getQuestion(), speakingDTO.getTime());
    }

}
