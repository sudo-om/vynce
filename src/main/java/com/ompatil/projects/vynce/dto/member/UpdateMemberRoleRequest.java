package com.ompatil.projects.vynce.dto.member;

import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(
        @NotNull ProjectRole role)
) {
}
