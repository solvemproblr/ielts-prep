package com.example.ieltsprepuz.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id) {
        super("User with " + id + " not found.");
    }

}
