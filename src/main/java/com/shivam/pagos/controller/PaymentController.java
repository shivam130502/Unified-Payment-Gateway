package com.shivam.pagos.controller;

import com.shivam.pagos.model.Payment;
import com.shivam.pagos.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @PostMapping("/initiate")
    public Payment initiatePayment(@RequestBody Payment payment) {
        return service.initiatePayment(payment);
    }

    @GetMapping("/status/{id}")
    public Payment getPaymentStatus(@PathVariable Long id) {
        return service.getPaymentStatus(id).orElseThrow(() -> new RuntimeException("Payment not found"));
    }
}
