package com.openpay.app.data.apimodel;

import java.io.Serializable;

public class WalletBean implements Serializable {

	private static final long serialVersionUID = 7832666490625130095L;

	private Long id;
	private String name;
	private String description;
	private Long coins;
	private UserDetailBean user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getCoins() {
		return coins;
	}

	public void setCoins(Long coins) {
		this.coins = coins;
	}

	public UserDetailBean getUser() {
		return user;
	}

	public void setUser(UserDetailBean user) {
		this.user = user;
	}
}
