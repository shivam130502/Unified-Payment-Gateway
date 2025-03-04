package com.shivam.pagos.repository;

import com.shivam.pagos.model.Chargeback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargebackRepository extends JpaRepository<Chargeback, Long> {
}
