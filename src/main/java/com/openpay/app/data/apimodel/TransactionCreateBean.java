package com.openpay.app.data.apimodel;

import java.io.Serializable;

public class TransactionCreateBean implements Serializable {

	private static final long serialVersionUID = -4414398788525753802L;

	private String originWallet;
	private String destinyWallet;
	private Long coins;

	public String getOriginWallet() {
		return originWallet;
	}

	public void setOriginWallet(String originWallet) {
		this.originWallet = originWallet;
	}

	public String getDestinyWallet() {
		return destinyWallet;
	}

	public void setDestinyWallet(String destinyWallet) {
		this.destinyWallet = destinyWallet;
	}

	public Long getCoins() {
		return coins;
	}

	public void setCoins(Long coins) {
		this.coins = coins;
	}

}
