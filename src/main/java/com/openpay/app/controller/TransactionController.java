package com.openpay.app.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openpay.app.common.URLConstants;
import com.openpay.app.data.apimodel.GenericResponse;
import com.openpay.app.data.apimodel.TransactionCreateBean;
import com.openpay.app.service.interfaces.TransactionService;

@RestController
@RequestMapping(value = URLConstants.TRANSACTIONS)
@CrossOrigin(origins = "*")
public class TransactionController {

	private static final String TRANSACTION_DONE = "Transaction done";

	@Autowired
	private TransactionService transactionService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	private GenericResponse createTransaction(@Valid @RequestBody TransactionCreateBean transactionBean) throws NoSuchAlgorithmException, IOException {
		return new GenericResponse(TRANSACTION_DONE, transactionService.createTransaction(transactionBean));
	}

}
