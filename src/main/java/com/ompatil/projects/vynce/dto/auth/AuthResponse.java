package com.ompatil.projects.vynce.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}
