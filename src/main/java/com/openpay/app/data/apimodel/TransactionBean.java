package com.openpay.app.data.apimodel;

import java.io.Serializable;

public class TransactionBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private WalletBean originWallet;
	private WalletBean destinyWallet;
	private Long coins;

	public WalletBean getOriginWallet() {
		return originWallet;
	}

	public void setOriginWallet(WalletBean originWallet) {
		this.originWallet = originWallet;
	}

	public WalletBean getDestinyWallet() {
		return destinyWallet;
	}

	public void setDestinyWallet(WalletBean destinyWallet) {
		this.destinyWallet = destinyWallet;
	}

	public Long getCoins() {
		return coins;
	}

	public void setCoins(Long coins) {
		this.coins = coins;
	}

}
