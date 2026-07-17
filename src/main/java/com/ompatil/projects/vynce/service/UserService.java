package com.ompatil.projects.vynce.service;

import com.ompatil.projects.vynce.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
