package com.example.ieltsprepuz.registration.validator;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {

    private final static String EMAIL_VALIDATOR = "";//TODO

    @Override
    public boolean test(String email) {
        return true;
    }
}
