package com.example.ieltsprepuz.registration.exception;

public class RegistrationException {

    private final static String EMAIL_IS_NOT_VALID = "%s is not valid";
    private final static String EMAIL_NOT_FOUND = "User with email %s not found";
    private final static String EMAIL_EXISTS = "User with email %s exists";
    private final static String EMAIL_IS_ALREADY_CONFIRMED = "This email is already confirmed";
    private final static String FAIL_TO_SEND_EMAIL = "Failed to send email";

    private final static String TOKEN_NOT_FOUND = "Token not found";
    private final static String TOKEN_EXPIRED = "Token is expired";

    public static RuntimeException emailIsNotValid(String email) {
        return new RuntimeException(String.format(EMAIL_IS_NOT_VALID, email));
    }

    public static RuntimeException emailNotFound(String email) {
        return new RuntimeException(String.format(EMAIL_NOT_FOUND, email));
    }

    public static RuntimeException emailExists(String email) {
        return new RuntimeException(String.format(EMAIL_EXISTS, email));
    }

    public static RuntimeException tokenNotFound() {
        return new RuntimeException(TOKEN_NOT_FOUND);
    }

    public static RuntimeException emailAlreadyConfirmed() {
        return new RuntimeException(EMAIL_IS_ALREADY_CONFIRMED);
    }

    public static RuntimeException tokenExpired() {
        return new RuntimeException(TOKEN_EXPIRED);
    }

    public static RuntimeException failToSendEmail() {
        return new RuntimeException(FAIL_TO_SEND_EMAIL);
    }
}
