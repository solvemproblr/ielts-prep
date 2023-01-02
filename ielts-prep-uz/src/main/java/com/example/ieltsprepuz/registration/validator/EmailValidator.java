package com.example.ieltsprepuz.registration.validator;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {

    private final static String EMAIL_VALIDATOR = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";;

    @Override
    public boolean test(String email) {
        return email.matches(EMAIL_VALIDATOR);
    }
}
