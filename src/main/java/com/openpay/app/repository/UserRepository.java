package com.openpay.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openpay.app.data.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
