package com.openpay.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openpay.app.data.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
