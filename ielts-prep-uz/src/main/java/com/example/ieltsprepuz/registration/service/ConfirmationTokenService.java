package com.example.ieltsprepuz.registration.service;

import com.example.ieltsprepuz.registration.entity.ConfirmationToken;

import java.util.Optional;

public interface ConfirmationTokenService {

    void saveConfirmationToken(ConfirmationToken token);

    Optional<ConfirmationToken> getToken(String token);
}
