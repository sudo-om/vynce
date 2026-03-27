package com.ompatil.projects.vynce.dto.chat;

public record ChatRequest(
        String message,
        Long projectId
) {
}
