package com.shivam.pagos.repository;

import com.shivam.pagos.model.PaymentTransaction;
import com.shivam.pagos.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTransactionRepository extends JpaRepository<PaymentTransaction, Long> {

	List<PaymentTransaction> findByUser(User user);
}
