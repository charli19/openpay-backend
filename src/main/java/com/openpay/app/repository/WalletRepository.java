package com.openpay.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openpay.app.data.entity.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long> {

	Wallet findByCodeAndActive(String code, boolean active);

}
