package com.ompatil.projects.vynce.service;

import com.ompatil.projects.vynce.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
