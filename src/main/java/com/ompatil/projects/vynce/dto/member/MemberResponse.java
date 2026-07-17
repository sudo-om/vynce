package com.ompatil.projects.vynce.dto.member;

import com.ompatil.projects.vynce.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String username,
        String name,
        ProjectRole projectRole,
        Instant invitedAt
) {
}
