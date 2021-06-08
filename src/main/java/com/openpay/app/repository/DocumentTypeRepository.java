package com.openpay.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openpay.app.data.entity.DocumentType;

public interface DocumentTypeRepository extends JpaRepository<DocumentType, Long> {

}
