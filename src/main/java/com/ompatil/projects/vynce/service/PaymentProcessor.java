package com.ompatil.projects.vynce.service;

import com.ompatil.projects.vynce.dto.subscription.CheckoutRequest;
import com.ompatil.projects.vynce.dto.subscription.CheckoutResponse;
import com.ompatil.projects.vynce.dto.subscription.PortalResponse;
import com.stripe.model.StripeObject;

import java.util.Map;

public interface PaymentProcessor {

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request);

    PortalResponse openCustomerPortal();

    void handleWebhookEvent(String type, StripeObject stripeObject, Map<String, String> metadata);
}
