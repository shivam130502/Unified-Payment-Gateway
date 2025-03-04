package com.shivam.pagos.repository;

import com.shivam.pagos.model.PaymentGatewayCredential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentGatewayCredentialRepository extends JpaRepository<PaymentGatewayCredential, Long> {
}
