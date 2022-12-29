package com.example.ieltsprepuz.registration.service;

import com.example.ieltsprepuz.registration.entity.AppUser;
import com.example.ieltsprepuz.registration.entity.AppUserRole;
import com.example.ieltsprepuz.registration.exception.RegistrationException;
import com.example.ieltsprepuz.registration.model.RegistrationRequest;
import com.example.ieltsprepuz.registration.token.ConfirmationToken;
import com.example.ieltsprepuz.registration.token.ConfirmationTokenService;
import com.example.ieltsprepuz.registration.validator.EmailValidator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    private final AppUserService appUserService;
    private final EmailValidator emailValidator;
    private final ConfirmationTokenService confirmationTokenService;

    @Override
    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());

        if (!isValidEmail) {
            throw RegistrationException.emailIsNotValid(request.getEmail());
        }

        return appUserService.signUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );
    }

    @Override
    @Transactional
    public String confirmToken(String token) {
        ConfirmationToken confirmationToken = confirmationTokenService
                .getToken(token)
                .orElseThrow(() -> RegistrationException.tokenNotFound());

        if (confirmationToken.getConfirmedAt() != null) {
            throw RegistrationException.emailAlreadyConfirmed();
        }

        LocalDateTime expiresAt = confirmationToken.getExpiresAt();

        if (expiresAt.isBefore(LocalDateTime.now())) {
            throw RegistrationException.tokenExpired();
        }

        confirmationToken.setConfirmedAt(LocalDateTime.now());

        appUserService.enableAppUser(confirmationToken.getAppUser().getEmail());

        return "confirmed";
    }
}
