package com.ompatil.projects.vynce.dto.member;

import com.ompatil.projects.vynce.enums.ProjectRole;
import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(
        @NotNull ProjectRole role) {
}
