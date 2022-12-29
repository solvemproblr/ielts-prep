package com.example.ieltsprepuz.registration.controller;

import com.example.ieltsprepuz.registration.model.RegistrationRequest;
import com.example.ieltsprepuz.registration.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping("/register")
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }

    @GetMapping("/confirm")
    public String confirm(@RequestParam(name = "token") String token){
        return registrationService.confirmToken(token);
    }

}
