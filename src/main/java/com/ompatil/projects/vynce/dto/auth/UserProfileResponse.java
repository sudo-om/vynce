package com.ompatil.projects.vynce.dto.auth;

public record UserProfileResponse(
        Long id,
        String username,
        String name
) {
}
