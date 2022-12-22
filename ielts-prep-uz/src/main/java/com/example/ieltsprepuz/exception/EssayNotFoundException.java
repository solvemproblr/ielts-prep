package com.example.ieltsprepuz.exception;

public class EssayNotFoundException extends RuntimeException{

    public EssayNotFoundException(Long id)
    {
        super("Essay with " + id + " is not found.");
    }

}
