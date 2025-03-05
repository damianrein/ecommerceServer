package com.ecommerceServer.service;

import org.springframework.stereotype.Service;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;

@Service
public class StripeService {

    private String stripeApiKey;

    public String processPayment(Long amount, String currency, String paymentMethodId) {
        Stripe.apiKey = stripeApiKey;

        try {
            PaymentIntentCreateParams params =
                PaymentIntentCreateParams.builder()
                    .setAmount(amount) // Cantidad en centavos 1000 = 10 USD
                    .setCurrency(currency) // Moneda 
                    .setPaymentMethod(paymentMethodId)
                    .build();

            PaymentIntent paymentIntent = PaymentIntent.create(params);
            return paymentIntent.getStatus();

        } catch (StripeException e) {
            e.printStackTrace();
            return "failed";
        }
    }
}
