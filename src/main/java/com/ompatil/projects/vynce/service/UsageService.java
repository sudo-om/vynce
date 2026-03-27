package com.ompatil.projects.vynce.service;

import com.ompatil.projects.vynce.dto.subscription.PlanLimitsResponse;
import com.ompatil.projects.vynce.dto.subscription.UsageTodayResponse;

public interface UsageService {
     UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
