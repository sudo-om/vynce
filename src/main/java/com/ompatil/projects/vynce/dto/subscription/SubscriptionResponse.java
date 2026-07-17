package com.ompatil.projects.vynce.dto.subscription;

import java.time.Instant;

public record SubscriptionResponse(
        PlanResponse plan,
        String status,
        Instant currentPeriodEnd,
        Long tokensUsedThisCycle
) {
}
