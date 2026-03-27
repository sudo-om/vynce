package com.ompatil.projects.vynce.service;

import com.ompatil.projects.vynce.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
     List<PlanResponse> getAllActivePlans();
}
