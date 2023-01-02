package com.example.ieltsprepuz.ielts.exception;

public class SpeakingNotFoundException extends RuntimeException {
    public SpeakingNotFoundException(Long id) {
        super("Speaking question with " + id + " is not found.");
    }
}
