package com.ompatil.projects.vynce.service.impl;

import com.ompatil.projects.vynce.dto.auth.UserProfileResponse;
import com.ompatil.projects.vynce.dto.subscription.PlanLimitsResponse;
import com.ompatil.projects.vynce.dto.subscription.UsageTodayResponse;
import com.ompatil.projects.vynce.service.UsageService;
import com.ompatil.projects.vynce.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {

    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
