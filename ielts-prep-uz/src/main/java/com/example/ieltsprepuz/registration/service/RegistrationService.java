package com.example.ieltsprepuz.registration.service;

import com.example.ieltsprepuz.registration.model.RegistrationRequest;

public interface RegistrationService {

    String register(RegistrationRequest request);

    String confirmToken(String token);

}
