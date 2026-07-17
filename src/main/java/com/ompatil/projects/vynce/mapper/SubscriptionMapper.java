package com.ompatil.projects.vynce.mapper;

import com.ompatil.projects.vynce.dto.subscription.PlanResponse;
import com.ompatil.projects.vynce.dto.subscription.SubscriptionResponse;
import com.ompatil.projects.vynce.entity.Plan;
import com.ompatil.projects.vynce.entity.Subscription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanResponse toPlanResponse(Plan plan);
}
