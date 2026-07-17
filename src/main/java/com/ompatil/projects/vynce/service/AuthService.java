package com.ompatil.projects.vynce.service;

import com.ompatil.projects.vynce.dto.auth.AuthResponse;
import com.ompatil.projects.vynce.dto.auth.LoginRequest;
import com.ompatil.projects.vynce.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
