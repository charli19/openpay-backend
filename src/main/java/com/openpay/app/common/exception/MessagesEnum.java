package com.openpay.app.common.exception;

public enum MessagesEnum {

	NIF_NOT_VALID("nif.not.valid"),
	WALLET_NOT_VALID("wallet.not.valid"),
	COINS_NOT_VALID("coins.not.valid");

	private String code;

	private MessagesEnum(String code)
	{
		this.code = code;
	}

	public String getCode()
	{
		return code;
	}

}
