package com.example.ieltsprepuz.registration.service;

import com.example.ieltsprepuz.registration.entity.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AppUserService extends UserDetailsService {

    String signUpUser(AppUser appUser);

    void enableAppUser(String email);
}
