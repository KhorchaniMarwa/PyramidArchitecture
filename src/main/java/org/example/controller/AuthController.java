package org.example.controller;

import jakarta.validation.Valid;
import org.example.dto.SignInRequest;
import org.example.dto.SignUpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")

public class AuthController {

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody SignInRequest loginRequest) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
            // call your service to create the user
            return ResponseEntity.ok("User registered successfully");
        }

}
