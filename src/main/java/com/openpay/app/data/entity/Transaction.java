package com.openpay.app.data.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "[TRANSACTION]", schema = "dbo")
public class Transaction extends Auditable implements Serializable {

	private static final long serialVersionUID = 6006452756274937547L;

	@Id
	@Column(name = "ID", nullable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "origin_wallet_id", referencedColumnName = "id")
	private Wallet originWallet;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "destiny_wallet_id", referencedColumnName = "id")
	private Wallet destinyWallet;

	@Column
	private Long coins;

	public Transaction() {
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Wallet getOriginWallet() {
		return originWallet;
	}

	public void setOriginWallet(Wallet originWallet) {
		this.originWallet = originWallet;
	}

	public Wallet getDestinyWallet() {
		return destinyWallet;
	}

	public void setDestinyWallet(Wallet destinyWallet) {
		this.destinyWallet = destinyWallet;
	}

	public Long getCoins() {
		return coins;
	}

	public void setCoins(Long coins) {
		this.coins = coins;
	}
}
