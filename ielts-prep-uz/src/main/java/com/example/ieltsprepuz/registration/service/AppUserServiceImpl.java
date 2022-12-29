package com.example.ieltsprepuz.registration.service;

import com.example.ieltsprepuz.registration.entity.AppUser;
import com.example.ieltsprepuz.registration.exception.RegistrationException;
import com.example.ieltsprepuz.registration.repository.AppUserRepository;
import com.example.ieltsprepuz.registration.token.ConfirmationToken;
import com.example.ieltsprepuz.registration.token.ConfirmationTokenService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AppUserServiceImpl implements AppUserService {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final AppUserRepository appUserRepository;
    private final ConfirmationTokenService confirmationTokenService;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {

        return appUserRepository.findByEmail(email)
                .orElseThrow(() -> RegistrationException.emailNotFound(email));
    }

    @Override
    public String signUpUser(AppUser appUser) {
        boolean isUserExists = appUserRepository.findByEmail(appUser.getEmail()).isPresent();

        if (isUserExists) {
            AppUser user = appUserRepository.findByEmail(appUser.getEmail()).get();
            if(user.getEnabled()) {
                throw RegistrationException.emailExists(appUser.getEmail());
            }
        }

        String encodedPassword = bCryptPasswordEncoder.encode(appUser.getPassword());

        appUser.setPassword(encodedPassword);

        appUserRepository.save(appUser);

        String token = UUID.randomUUID().toString();

        ConfirmationToken confirmationToken = new ConfirmationToken(
                token,
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(15),
                null,
                appUser
        );

        confirmationTokenService.saveConfirmationToken(confirmationToken);

        return token;
    }

    @Override
    public void enableAppUser(String email) {
        AppUser appUser = appUserRepository.findByEmail(email).get();
        appUser.setEnabled(true);
        appUserRepository.save(appUser);
    }

}
