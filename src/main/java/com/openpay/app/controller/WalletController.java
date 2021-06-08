package com.openpay.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openpay.app.common.URLConstants;
import com.openpay.app.data.apimodel.GenericResponse;
import com.openpay.app.service.interfaces.WalletService;

@RestController
@RequestMapping(value = URLConstants.WALLETS, produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class WalletController {

	private static final String LIST_OF_WALLETS = "List of wallets";

	@Autowired
	private WalletService walletService;

	@GetMapping
	private GenericResponse getWallets() {
		return new GenericResponse(LIST_OF_WALLETS, walletService.getWallets());
	}

}
