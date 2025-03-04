package com.shivam.pagos.service;

import com.shivam.pagos.model.Payment;
import com.shivam.pagos.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentService {
    private final PaymentRepository repository;

    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public Payment initiatePayment(Payment payment) {
        payment.setStatus("PENDING");
        return repository.save(payment);
    }

    public Optional<Payment> getPaymentStatus(Long id) {
        return repository.findById(id);
    }
}
