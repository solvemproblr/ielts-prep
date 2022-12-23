package com.example.ieltsprepuz.exception;

public class SpeakingNotFoundException extends RuntimeException {
    public SpeakingNotFoundException(Long id) {
        super("Speaking question with " + id + " is not found.");
    }
}
