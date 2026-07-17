package com.ompatil.projects.vynce.service.impl;

import com.ompatil.projects.vynce.dto.subscription.PlanResponse;
import com.ompatil.projects.vynce.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
