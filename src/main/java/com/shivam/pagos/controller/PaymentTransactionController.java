package com.shivam.pagos.controller;

import com.shivam.pagos.model.PaymentTransaction;
import com.shivam.pagos.service.PaymentTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class PaymentTransactionController {

    @Autowired
    private PaymentTransactionService transactionService;

    @GetMapping
    public ResponseEntity<Object> getAllTransactions() {
        return ResponseEntity.ok(transactionService.getAllTransactions());
    }

    @PostMapping
    public ResponseEntity<Object> createTransaction(@RequestBody PaymentTransaction transaction) {
        return ResponseEntity.ok(transactionService.saveTransaction(transaction));
    }
}
