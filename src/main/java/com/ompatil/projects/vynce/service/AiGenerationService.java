package com.ompatil.projects.vynce.service;

import reactor.core.publisher.Flux;

public interface AiGenerationService {
    Flux<String> streamResponse(String message, Long projectId);
}
